<METHOD_START> @ Before public void void ( ) java.net.MalformedURLException { org.springframework.data.solr.SolrClient = new HttpSolrClient ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { org.springframework.data.solr.SolrClient = null ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { HttpSolrClientFactory org.springframework.data.solr.HttpSolrClientFactory = new HttpSolrClientFactory ( org.springframework.data.solr.SolrClient ) ; Assert . assertEquals ( org.springframework.data.solr.SolrClient , org.springframework.data.solr.HttpSolrClientFactory . getSolrClient ( ) ) ; Assert . assertEquals ( java.lang.String , ( ( HttpSolrClient ) org.springframework.data.solr.HttpSolrClientFactory . getSolrClient ( ) ) . getBaseURL ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new HttpSolrClientFactory ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { HttpSolrClientFactory org.springframework.data.solr.HttpSolrClientFactory = new HttpSolrClientFactory ( org.springframework.data.solr.SolrClient , new UsernamePasswordCredentials ( STRING , STRING ) , STRING ) ; AbstractHttpClient org.springframework.data.solr.AbstractHttpClient = ( AbstractHttpClient ) ( ( HttpSolrClient ) org.springframework.data.solr.HttpSolrClientFactory . getSolrClient ( ) ) . getHttpClient ( ) ; Assert . assertNotNull ( org.springframework.data.solr.AbstractHttpClient . getCredentialsProvider ( ) . getCredentials ( AuthScope . ANY ) ) ; Assert . assertNotNull ( org.springframework.data.solr.AbstractHttpClient . getParams ( ) . getParameter ( AuthPNames . TARGET_AUTH_PREF ) ) ; Assert . assertEquals ( STRING , ( ( UsernamePasswordCredentials ) org.springframework.data.solr.AbstractHttpClient . getCredentialsProvider ( ) . getCredentials ( AuthScope . ANY ) ) . getUserName ( ) ) ; Assert . assertEquals ( STRING , ( ( UsernamePasswordCredentials ) org.springframework.data.solr.AbstractHttpClient . getCredentialsProvider ( ) . getCredentials ( AuthScope . ANY ) ) . getPassword ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new HttpSolrClientFactory ( org.springframework.data.solr.SolrClient , new UsernamePasswordCredentials ( STRING , STRING ) , STRING ) ; }  <METHOD_END>
