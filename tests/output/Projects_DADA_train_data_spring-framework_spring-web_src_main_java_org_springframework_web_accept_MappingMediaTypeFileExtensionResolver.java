<METHOD_START> public void ( java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> < java.lang.String , MediaType > java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> ) { if ( java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> != null ) { for ( java.util.Map.Entry<java.lang.String,org.springframework.web.accept.MediaType> < java.lang.String , MediaType > java.util.Map.Entry<java.lang.String,org.springframework.web.accept.MediaType> : java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> . entrySet ( ) ) { java.lang.String java.lang.String = java.util.Map.Entry<java.lang.String,org.springframework.web.accept.MediaType> . getKey ( ) . toLowerCase ( java.util.Locale . java.util.Locale ) ; MediaType org.springframework.web.accept.MediaType = java.util.Map.Entry<java.lang.String,org.springframework.web.accept.MediaType> . getValue ( ) ; this . java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.web.accept.MediaType> . put ( java.lang.String , org.springframework.web.accept.MediaType ) ; this . org.springframework.web.accept.MultiValueMap<org.springframework.web.accept.MediaType,java.lang.String> . add ( org.springframework.web.accept.MediaType , java.lang.String ) ; this . java.util.List<java.lang.String> . boolean ( java.lang.String ) ; } } }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> < java.lang.String , MediaType > java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> ( ) { return this . java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.web.accept.MediaType> ; }  <METHOD_END>
<METHOD_START> protected java.util.List<org.springframework.web.accept.MediaType> < MediaType > java.util.List<org.springframework.web.accept.MediaType> ( ) { return new java.util.ArrayList <> ( this . java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.web.accept.MediaType> . values ( ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String , MediaType org.springframework.web.accept.MediaType ) { MediaType org.springframework.web.accept.MediaType = this . java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.web.accept.MediaType> . putIfAbsent ( java.lang.String , org.springframework.web.accept.MediaType ) ; if ( org.springframework.web.accept.MediaType == null ) { this . org.springframework.web.accept.MultiValueMap<org.springframework.web.accept.MediaType,java.lang.String> . add ( org.springframework.web.accept.MediaType , java.lang.String ) ; this . java.util.List<java.lang.String> . boolean ( java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( MediaType org.springframework.web.accept.MediaType ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = this . org.springframework.web.accept.MultiValueMap<org.springframework.web.accept.MediaType,java.lang.String> . get ( org.springframework.web.accept.MediaType ) ; return ( java.util.List<java.lang.String> != null ) ? java.util.List<java.lang.String> : java.util.Collections . java.util.List<java.lang.String> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return java.util.Collections . java.util.List<java.lang.String> ( this . java.util.List<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.accept.MediaType org.springframework.web.accept.MediaType ( java.lang.String java.lang.String ) { return this . java.util.concurrent.ConcurrentMap<java.lang.String,org.springframework.web.accept.MediaType> . get ( java.lang.String . java.lang.String ( java.util.Locale . java.util.Locale ) ) ; }  <METHOD_END>
