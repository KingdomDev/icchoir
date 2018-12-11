<template>
  <div>
    <custom-menu></custom-menu>
    <div class="container" id="medias">
      <h2>Bibliothèque - Documents</h2>
      <custom-menu-media></custom-menu-media>
      <!--div class="col-lg-12" v-if="documents && documents.length" id="documents"-->

        <!-- PDF files card -->
        <!--b-card v-for="document of documents" :key="document.id"
                v-if="document.type === 'pdf'"
                :title="document.name"
                img-src="../static/file-logo-pdf.png"
                img-alt="Image"
                img-top
                tag="article"
                class="mb-1 col-md-3 doc-card">
          <p class="card-text">
            {{document.description}}
          </p>
          <b-button href="#" variant="secondary">Afficher</b-button>
        </b-card-->
        <b-table hover :items="this.documents" :fields="this.fields">
          <template slot="type" slot-scope="data">
            <v-icon v-if="data.item.type==='pdf'" name="file-pdf"/>
            <v-icon v-if="data.item.type==='doc'" name="file-alt"/>
            {{data.item.type}}
          </template>
          <template slot="action" slot-scope="data">
            <router-link :to="{name: 'Document', params: data.item}">
              <v-icon name="eye"></v-icon>
            </router-link>
          </template>
        </b-table>
      <!--/div-->
    </div>
    <custom-footer></custom-footer>
  </div>
</template>

<script>
  import CustomMenu from './Menu.vue'
  import CustomFooter from './Footer.vue'
  import CustomMenuMedia from './MenuMedia.vue'

  import axios from 'axios'

  export default {
    name: 'medias-documents',

    data () {
      return {
        api: 'http://localhost:8080/api',
        fields: [
          'type',
          {key: 'name', label: 'Nom', sortable: true},
          {key: 'description'},
          'action'
        ],
        documentsPDF: [],
        documentsDOC: [],
        documentsEXC: [],
        documents: [],
        errors: [],
        documentDirectory: '/static/document/'
      }
    },

    components: {
      CustomMenu,
      CustomFooter,
      CustomMenuMedia
    },

    created() {
      axios.get(this.api + '/documents').
      then(response => {
        this.documentsPDF = response.data.filter(doc => doc.type==='pdf');
        this.documentsDOC = response.data.filter(doc => doc.type==='doc');
        this.documentsEXC = response.data.filter(doc => doc.type==='exc');
        this.documents = response.data;
      }).catch (e => {
        this.errors.push(e);
      });
    },

    /*mounted() {
      let recaptchaScript = document.createElement('script');
      recaptchaScript.setAttribute('src', '/static/lib/pdfobject.min.js');
      recaptchaScript.async = true;
      document.head.appendChild(recaptchaScript);
    },*/
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  #calendar {
  'height': 100vh
  }

  .doc-card {
    float: left;
    width: 100%;
    max-height: 100%;
  }
</style>
