<METHOD_START> void ( java.util.List<org.springframework.data.rest.core.mapping.ParameterMetadata> < ParameterMetadata > java.util.List<org.springframework.data.rest.core.mapping.ParameterMetadata> ) { Assert . notNull ( java.util.List<org.springframework.data.rest.core.mapping.ParameterMetadata> , STRING ) ; this . java.util.List<org.springframework.data.rest.core.mapping.ParameterMetadata> = java.util.List<org.springframework.data.rest.core.mapping.ParameterMetadata> ; }  <METHOD_END>
<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> < java.lang.String > ( java.util.List<org.springframework.data.rest.core.mapping.ParameterMetadata> . size ( ) ) ; for ( ParameterMetadata org.springframework.data.rest.core.mapping.ParameterMetadata : java.util.List<org.springframework.data.rest.core.mapping.ParameterMetadata> ) { java.util.List<java.lang.String> . boolean ( org.springframework.data.rest.core.mapping.ParameterMetadata . getName ( ) ) ; } return java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Iterator<org.springframework.data.rest.core.mapping.ParameterMetadata> < ParameterMetadata > java.util.Iterator<org.springframework.data.rest.core.mapping.ParameterMetadata> ( ) { return java.util.List<org.springframework.data.rest.core.mapping.ParameterMetadata> . iterator ( ) ; }  <METHOD_END>