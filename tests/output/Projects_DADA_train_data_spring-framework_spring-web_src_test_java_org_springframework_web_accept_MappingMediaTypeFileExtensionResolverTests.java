<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> < java.lang.String , MediaType > java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> = java.util.Collections . java.util.Map ( STRING , MediaType . APPLICATION_JSON ) ; MappingMediaTypeFileExtensionResolver org.springframework.web.accept.MappingMediaTypeFileExtensionResolver = new MappingMediaTypeFileExtensionResolver ( java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = org.springframework.web.accept.MappingMediaTypeFileExtensionResolver . resolveFileExtensions ( MediaType . APPLICATION_JSON ) ; assertEquals ( NUMBER , java.util.List<java.lang.String> . int ( ) ) ; assertEquals ( STRING , java.util.List<java.lang.String> . java.lang.String ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> < java.lang.String , MediaType > java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> = java.util.Collections . java.util.Map ( STRING , MediaType . APPLICATION_JSON ) ; MappingMediaTypeFileExtensionResolver org.springframework.web.accept.MappingMediaTypeFileExtensionResolver = new MappingMediaTypeFileExtensionResolver ( java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = org.springframework.web.accept.MappingMediaTypeFileExtensionResolver . resolveFileExtensions ( MediaType . TEXT_HTML ) ; assertTrue ( java.util.List<java.lang.String> . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> < java.lang.String , MediaType > java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> = java.util.Collections . java.util.Map ( STRING , MediaType . APPLICATION_JSON ) ; MappingMediaTypeFileExtensionResolver org.springframework.web.accept.MappingMediaTypeFileExtensionResolver = new MappingMediaTypeFileExtensionResolver ( java.util.Map<java.lang.String,org.springframework.web.accept.MediaType> ) ; MediaType org.springframework.web.accept.MediaType = org.springframework.web.accept.MappingMediaTypeFileExtensionResolver . lookupMediaType ( STRING ) ; assertEquals ( org.springframework.web.accept.MediaType , MediaType . APPLICATION_JSON ) ; }  <METHOD_END>
