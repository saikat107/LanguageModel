<METHOD_START> @ Test public void void ( ) java.lang.Exception { Link org.springframework.data.rest.tests.shop.Link = client . discoverUnique ( STRING ) ; java.lang.String java.lang.String = JsonPath . parse ( client . request ( org.springframework.data.rest.tests.shop.Link ) . getContentAsString ( ) ) . read ( STRING ) ; ResultActions org.springframework.data.rest.tests.shop.ResultActions = client . follow ( java.lang.String ) . andExpect ( jsonPath ( STRING , is ( STRING ) ) ) . andExpect ( jsonPath ( STRING ) . exists ( ) ) ; void ( STRING , org.springframework.data.rest.tests.shop.ResultActions ) ; void ( STRING , org.springframework.data.rest.tests.shop.ResultActions ) ; void ( STRING , org.springframework.data.rest.tests.shop.ResultActions ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Collections . java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING ) ; client . follow ( client . discoverUnique ( STRING ) . expand ( java.util.Map<java.lang.String,java.lang.Object> ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( jsonPath ( STRING , notNullValue ( ) ) ) . andExpect ( jsonPath ( STRING ) . doesNotExist ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Collections . java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING ) ; client . follow ( client . discoverUnique ( STRING ) . expand ( java.util.Map<java.lang.String,java.lang.Object> ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( jsonPath ( STRING ) . exists ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Collections . java.util.Map<java.lang.String,java.lang.Object> ( STRING , STRING ) ; client . follow ( client . discoverUnique ( STRING ) . expand ( java.util.Map<java.lang.String,java.lang.Object> ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( jsonPath ( STRING ) . exists ( ) ) . andExpect ( jsonPath ( STRING ) . exists ( ) ) ; }  <METHOD_END>
<METHOD_START> private static void void ( java.lang.String java.lang.String , ResultActions org.springframework.data.rest.tests.shop.ResultActions ) throws java.lang.Exception { int int = java.lang.String . int ( '.' ) ; java.lang.String java.lang.String = int == - NUMBER ? STRING : java.lang.String . java.lang.String ( NUMBER , int ) ; java.lang.String java.lang.String = int == - NUMBER ? java.lang.String : java.lang.String . java.lang.String ( int ) ; org.springframework.data.rest.tests.shop.ResultActions . andExpect ( jsonPath ( java.lang.String . java.lang.String ( java.lang.String ) ) . doesNotExist ( ) ) ; org.springframework.data.rest.tests.shop.ResultActions . andExpect ( jsonPath ( java.lang.String . java.lang.String ( STRING ) . java.lang.String ( java.lang.String ) ) . exists ( ) ) ; org.springframework.data.rest.tests.shop.ResultActions . andExpect ( jsonPath ( java.lang.String . java.lang.String ( STRING ) . java.lang.String ( java.lang.String ) ) . exists ( ) ) ; }  <METHOD_END>