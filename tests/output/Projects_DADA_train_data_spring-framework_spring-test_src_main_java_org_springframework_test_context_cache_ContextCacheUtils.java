<METHOD_START> public static int int ( ) { try { java.lang.String java.lang.String = SpringProperties . getProperty ( ContextCache . MAX_CONTEXT_CACHE_SIZE_PROPERTY_NAME ) ; if ( StringUtils . hasText ( java.lang.String ) ) { return java.lang.Integer . int ( java.lang.String . java.lang.String ( ) ) ; } } catch ( java.lang.Exception java.lang.Exception ) { } return ContextCache . DEFAULT_MAX_CONTEXT_CACHE_SIZE ; }  <METHOD_END>
