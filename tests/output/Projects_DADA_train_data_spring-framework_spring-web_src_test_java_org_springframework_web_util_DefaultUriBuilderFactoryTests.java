<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( ) ; java.net.URI java.net.URI = org.springframework.web.util.DefaultUriBuilderFactory . uriString ( STRING ) . pathSegment ( STRING ) . build ( STRING ) ; assertEquals ( STRING , java.net.URI . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( STRING ) ; java.net.URI java.net.URI = org.springframework.web.util.DefaultUriBuilderFactory . uriString ( STRING ) . port ( NUMBER ) . build ( ) ; assertEquals ( STRING , java.net.URI . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( STRING ) ; java.net.URI java.net.URI = org.springframework.web.util.DefaultUriBuilderFactory . uriString ( STRING ) . build ( ) ; assertEquals ( STRING , STRING , java.net.URI . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( STRING ) ; java.net.URI java.net.URI = org.springframework.web.util.DefaultUriBuilderFactory . builder ( ) . replacePath ( STRING ) . build ( ) ; assertEquals ( STRING , java.net.URI . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( STRING ) ; org.springframework.web.util.DefaultUriBuilderFactory . setDefaultUriVariables ( java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; java.net.URI java.net.URI = org.springframework.web.util.DefaultUriBuilderFactory . uriString ( STRING ) . build ( java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; assertEquals ( STRING , java.net.URI . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( STRING ) ; org.springframework.web.util.DefaultUriBuilderFactory . setDefaultUriVariables ( java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; java.net.URI java.net.URI = org.springframework.web.util.DefaultUriBuilderFactory . uriString ( STRING ) . build ( java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; assertEquals ( STRING , java.net.URI . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( STRING ) ; org.springframework.web.util.DefaultUriBuilderFactory . setDefaultUriVariables ( java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; java.net.URI java.net.URI = org.springframework.web.util.DefaultUriBuilderFactory . uriString ( STRING ) . build ( ) ; assertEquals ( STRING , STRING , java.net.URI . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( NUMBER ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( ) ; org.springframework.web.util.DefaultUriBuilderFactory . setDefaultUriVariables ( java.util.Map<java.lang.String,java.lang.String> ) ; java.net.URI java.net.URI = org.springframework.web.util.DefaultUriBuilderFactory . expand ( STRING , java.util.Map<java.lang.String,java.lang.Long> ( STRING , NUMBER ) ) ; assertEquals ( STRING , java.net.URI . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( ) ; org.springframework.web.util.DefaultUriBuilderFactory . setEncodingMode ( EncodingMode . VALUES_ONLY ) ; UriBuilder org.springframework.web.util.UriBuilder = org.springframework.web.util.DefaultUriBuilderFactory . uriString ( STRING ) ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; assertEquals ( java.lang.String , org.springframework.web.util.UriBuilder . build ( java.lang.String ) . toString ( ) ) ; assertEquals ( java.lang.String , org.springframework.web.util.UriBuilder . build ( java.util.Map<java.lang.String,java.lang.String> ( STRING , java.lang.String ) ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( ) ; org.springframework.web.util.DefaultUriBuilderFactory . setEncodingMode ( EncodingMode . VALUES_ONLY ) ; org.springframework.web.util.DefaultUriBuilderFactory . setDefaultUriVariables ( java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ; UriBuilder org.springframework.web.util.UriBuilder = org.springframework.web.util.DefaultUriBuilderFactory . uriString ( STRING ) ; assertEquals ( STRING , org.springframework.web.util.UriBuilder . build ( java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( ) ; org.springframework.web.util.DefaultUriBuilderFactory . setEncodingMode ( EncodingMode . NONE ) ; UriBuilder org.springframework.web.util.UriBuilder = org.springframework.web.util.DefaultUriBuilderFactory . uriString ( STRING ) ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; assertEquals ( java.lang.String , org.springframework.web.util.UriBuilder . build ( java.lang.String ) . toString ( ) ) ; assertEquals ( java.lang.String , org.springframework.web.util.UriBuilder . build ( java.util.Map<java.lang.String,java.lang.String> ( STRING , java.lang.String ) ) . toString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( STRING ) ; java.net.URI java.net.URI = org.springframework.web.util.DefaultUriBuilderFactory . uriString ( STRING ) . build ( STRING , STRING ) ; assertEquals ( STRING , java.net.URI . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( STRING ) ; org.springframework.web.util.DefaultUriBuilderFactory . setParsePath ( false ) ; java.net.URI java.net.URI = org.springframework.web.util.DefaultUriBuilderFactory . uriString ( STRING ) . build ( STRING , STRING ) ; assertEquals ( STRING , java.net.URI . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( ) ; java.net.URI java.net.URI = org.springframework.web.util.DefaultUriBuilderFactory . expand ( STRING ) ; assertEquals ( STRING , java.net.URI . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultUriBuilderFactory org.springframework.web.util.DefaultUriBuilderFactory = new DefaultUriBuilderFactory ( ) ; java.net.URI java.net.URI = org.springframework.web.util.DefaultUriBuilderFactory . expand ( STRING ) ; assertEquals ( STRING , java.net.URI . java.lang.String ( ) ) ; }  <METHOD_END>