<METHOD_START> @ Bean public org.springframework.data.rest.webmvc.alps.LinkDiscoverer org.springframework.data.rest.webmvc.alps.LinkDiscoverer ( ) { return new JsonPathLinkDiscoverer ( STRING , MediaType . valueOf ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( RepositoryRestConfiguration org.springframework.data.rest.webmvc.alps.RepositoryRestConfiguration ) { org.springframework.data.rest.webmvc.alps.RepositoryRestConfiguration . exposeIdsFor ( Item .class ) ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { MockMvc org.springframework.data.rest.webmvc.alps.MockMvc = MockMvcBuilders . webAppContextSetup ( org.springframework.data.rest.webmvc.alps.WebApplicationContext ) . build ( ) ; this . org.springframework.data.rest.webmvc.alps.TestMvcClient = new TestMvcClient ( org.springframework.data.rest.webmvc.alps.MockMvc , this . org.springframework.data.rest.webmvc.alps.LinkDiscoverers ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { org.springframework.data.rest.webmvc.alps.RepositoryRestConfiguration . setEnableEnumTranslation ( false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( STRING ) ; Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( org.springframework.data.rest.webmvc.alps.Link , STRING , MediaType . ALL ) ; org.springframework.data.rest.webmvc.alps.TestMvcClient . follow ( org.springframework.data.rest.webmvc.alps.Link , RestMediaTypes . ALPS_JSON ) . andExpect ( jsonPath ( STRING ) . value ( STRING ) ) . andExpect ( jsonPath ( STRING , hasItems ( STRING , STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( STRING ) ; Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( org.springframework.data.rest.webmvc.alps.Link , STRING , MediaType . ALL ) ; org.springframework.data.rest.webmvc.alps.TestMvcClient . follow ( org.springframework.data.rest.webmvc.alps.Link ) . andExpect ( jsonPath ( STRING ) . value ( STRING ) ) . andExpect ( jsonPath ( STRING , hasItems ( STRING , STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( STRING ) ; Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( org.springframework.data.rest.webmvc.alps.Link , STRING , MediaType . ALL ) ; org.springframework.data.rest.webmvc.alps.TestMvcClient . follow ( org.springframework.data.rest.webmvc.alps.Link , RestMediaTypes . ALPS_JSON ) . andExpect ( jsonPath ( STRING , hasItems ( STRING ) ) ) . andExpect ( jsonPath ( STRING , not ( hasItems ( STRING ) ) ) ) . andExpect ( jsonPath ( STRING , not ( hasItems ( STRING , STRING ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( STRING ) ; Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( org.springframework.data.rest.webmvc.alps.Link , STRING , MediaType . ALL ) ; assertThat ( org.springframework.data.rest.webmvc.alps.Link ) . isNotNull ( ) ; java.lang.String java.lang.String = org.springframework.data.rest.webmvc.alps.TestMvcClient . follow ( org.springframework.data.rest.webmvc.alps.Link , RestMediaTypes . ALPS_JSON ) . andReturn ( ) . getResponse ( ) . getContentAsString ( ) ; java.lang.String java.lang.String = JsonPath .< JSONArray > read ( java.lang.String , STRING ) . get ( NUMBER ) . toString ( ) ; assertThat ( java.lang.String , endsWith ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( STRING ) ; Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( org.springframework.data.rest.webmvc.alps.Link , STRING , MediaType . ALL ) ; java.lang.String java.lang.String = STRING ; java.lang.String += STRING ; java.lang.String += STRING ; java.lang.String += STRING ; java.lang.String java.lang.String = org.springframework.data.rest.webmvc.alps.TestMvcClient . follow ( org.springframework.data.rest.webmvc.alps.Link , RestMediaTypes . ALPS_JSON ) . andReturn ( ) . getResponse ( ) . getContentAsString ( ) ; java.lang.String java.lang.String = JsonPath .< JSONArray > read ( java.lang.String , java.lang.String ) . get ( NUMBER ) . toString ( ) ; assertThat ( java.lang.String ) . contains ( ProfileController . PROFILE_ROOT_MAPPING ) . endsWith ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( STRING ) ; Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( org.springframework.data.rest.webmvc.alps.Link , STRING , MediaType . ALL ) ; org.springframework.data.rest.webmvc.alps.TestMvcClient . follow ( org.springframework.data.rest.webmvc.alps.Link , RestMediaTypes . ALPS_JSON ) . andExpect ( jsonPath ( STRING , hasItems ( STRING , STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.rest.webmvc.alps.RepositoryRestConfiguration . setEnableEnumTranslation ( true ) ; Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( STRING ) ; Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( org.springframework.data.rest.webmvc.alps.Link , STRING , MediaType . ALL ) ; java.lang.String java.lang.String = org.springframework.data.rest.webmvc.alps.TestMvcClient . follow ( org.springframework.data.rest.webmvc.alps.Link ) . andReturn ( ) . getResponse ( ) . getContentAsString ( ) ; java.lang.String java.lang.String = JsonPath .< JSONArray > read ( java.lang.String , STRING ) . get ( NUMBER ) . toString ( ) ; assertThat ( java.lang.String ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( STRING ) ; Link org.springframework.data.rest.webmvc.alps.Link = org.springframework.data.rest.webmvc.alps.TestMvcClient . discoverUnique ( org.springframework.data.rest.webmvc.alps.Link , STRING ) ; java.lang.String java.lang.String = org.springframework.data.rest.webmvc.alps.TestMvcClient . follow ( org.springframework.data.rest.webmvc.alps.Link ) . andReturn ( ) . getResponse ( ) . getContentAsString ( ) ; java.lang.String java.lang.String = JsonPath .< JSONArray > read ( java.lang.String , STRING ) . get ( NUMBER ) . toString ( ) ; assertThat ( java.lang.String ) . isEqualTo ( STRING ) ; }  <METHOD_END>
