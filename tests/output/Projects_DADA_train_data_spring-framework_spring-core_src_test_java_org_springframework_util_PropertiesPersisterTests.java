<METHOD_START> @ Test public void void ( ) java.io.IOException { java.lang.String java.lang.String = STRING ; java.util.Properties java.util.Properties = java.util.Properties ( java.lang.String , false ) ; java.lang.String java.lang.String = java.lang.String ( java.util.Properties , null , false ) ; java.util.Properties ( java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.lang.String java.lang.String = STRING ; java.util.Properties java.util.Properties = java.util.Properties ( java.lang.String , false ) ; java.lang.String java.lang.String = java.lang.String ( java.util.Properties , null , false ) ; java.util.Properties ( java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.lang.String java.lang.String = STRING ; java.util.Properties java.util.Properties = java.util.Properties ( java.lang.String , false ) ; java.lang.String java.lang.String = java.lang.String ( java.util.Properties , STRING , false ) ; java.util.Properties ( java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.lang.String java.lang.String = STRING ; java.util.Properties java.util.Properties = java.util.Properties ( java.lang.String , false ) ; java.lang.String java.lang.String = java.lang.String ( java.util.Properties , null , false ) ; java.util.Properties ( java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.lang.String java.lang.String = STRING ; java.util.Properties java.util.Properties = java.util.Properties ( java.lang.String , true ) ; java.lang.String java.lang.String = java.lang.String ( java.util.Properties , null , true ) ; java.util.Properties ( java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.lang.String java.lang.String = STRING ; java.util.Properties java.util.Properties = java.util.Properties ( java.lang.String , true ) ; java.lang.String java.lang.String = java.lang.String ( java.util.Properties , null , true ) ; java.util.Properties ( java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.lang.String java.lang.String = STRING ; java.util.Properties java.util.Properties = java.util.Properties ( java.lang.String , true ) ; java.lang.String java.lang.String = java.lang.String ( java.util.Properties , STRING , true ) ; java.util.Properties ( java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.lang.String java.lang.String = STRING ; java.util.Properties java.util.Properties = java.util.Properties ( java.lang.String , true ) ; java.lang.String java.lang.String = java.lang.String ( java.util.Properties , null , true ) ; java.util.Properties ( java.lang.String , false ) ; }  <METHOD_END>
<METHOD_START> private java.util.Properties java.util.Properties ( java.lang.String java.lang.String , boolean boolean ) throws java.io.IOException { DefaultPropertiesPersister org.springframework.util.DefaultPropertiesPersister = new DefaultPropertiesPersister ( ) ; java.util.Properties java.util.Properties = new java.util.Properties ( ) ; if ( boolean ) { org.springframework.util.DefaultPropertiesPersister . load ( java.util.Properties , new java.io.StringReader ( java.lang.String ) ) ; } else { org.springframework.util.DefaultPropertiesPersister . load ( java.util.Properties , new java.io.ByteArrayInputStream ( java.lang.String . byte[] ( ) ) ) ; } assertEquals ( STRING , java.util.Properties . java.lang.String ( STRING ) ) ; assertEquals ( STRING , java.util.Properties . java.lang.String ( STRING ) ) ; return java.util.Properties ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.util.Properties java.util.Properties , java.lang.String java.lang.String , boolean boolean ) throws java.io.IOException { DefaultPropertiesPersister org.springframework.util.DefaultPropertiesPersister = new DefaultPropertiesPersister ( ) ; java.lang.String java.lang.String = null ; if ( boolean ) { java.io.StringWriter java.io.StringWriter = new java.io.StringWriter ( ) ; org.springframework.util.DefaultPropertiesPersister . store ( java.util.Properties , java.io.StringWriter , java.lang.String ) ; java.lang.String = java.io.StringWriter . java.lang.String ( ) ; } else { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; org.springframework.util.DefaultPropertiesPersister . store ( java.util.Properties , java.io.ByteArrayOutputStream , java.lang.String ) ; java.lang.String = new java.lang.String ( java.io.ByteArrayOutputStream . byte[] ( ) ) ; } if ( java.lang.String != null ) { assertTrue ( java.lang.String . int ( java.lang.String ) != - NUMBER ) ; } assertTrue ( java.lang.String . int ( STRING ) != - NUMBER ) ; assertTrue ( java.lang.String . int ( STRING ) != - NUMBER ) ; return java.lang.String ; }  <METHOD_END>
