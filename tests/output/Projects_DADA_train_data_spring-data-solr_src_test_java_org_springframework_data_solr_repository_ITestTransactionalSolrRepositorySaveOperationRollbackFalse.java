<METHOD_START> @ BeforeTransaction public void void ( ) { Mockito . reset ( org.springframework.data.solr.repository.SolrClient ) ; }  <METHOD_END>
<METHOD_START> @ AfterTransaction public void void ( ) org.springframework.data.solr.repository.SolrServerException , java.io.IOException { Mockito . verify ( org.springframework.data.solr.repository.SolrClient , Mockito . times ( NUMBER ) ) . commit ( Mockito . any ( ) ) ; Mockito . verify ( org.springframework.data.solr.repository.SolrClient , Mockito . never ( ) ) . rollback ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProductBean org.springframework.data.solr.repository.ProductBean = new ProductBean ( ) ; org.springframework.data.solr.repository.ProductBean . setId ( java.lang.String ) ; org.springframework.data.solr.repository.ProductRepository . save ( org.springframework.data.solr.repository.ProductBean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ProductBean org.springframework.data.solr.repository.ProductBean = new ProductBean ( ) ; org.springframework.data.solr.repository.ProductBean . setId ( java.lang.String ) ; org.springframework.data.solr.repository.ProductRepository . save ( java.util.Collections . java.util.List ( org.springframework.data.solr.repository.ProductBean ) ) ; }  <METHOD_END>
