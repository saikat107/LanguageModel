<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String ( java.lang.String , WebUtils . DEFAULT_CHARACTER_ENCODING ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; if ( java.lang.String == null ) { return null ; } java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( java.lang.String . int ( ) * NUMBER ) ; for ( int int = NUMBER ; int < java.lang.String . int ( ) ; int ++ ) { char char = java.lang.String . char ( int ) ; java.lang.String java.lang.String = org.springframework.web.util.HtmlCharacterEntityReferences . convertToReference ( char , java.lang.String ) ; if ( java.lang.String != null ) { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.String ) ; } else { java.lang.StringBuilder . java.lang.StringBuilder ( char ) ; } } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String ( java.lang.String , WebUtils . DEFAULT_CHARACTER_ENCODING ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; if ( java.lang.String == null ) { return null ; } java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( java.lang.String . int ( ) * NUMBER ) ; for ( int int = NUMBER ; int < java.lang.String . int ( ) ; int ++ ) { char char = java.lang.String . char ( int ) ; if ( org.springframework.web.util.HtmlCharacterEntityReferences . isMappedToReference ( char , java.lang.String ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( HtmlCharacterEntityReferences . DECIMAL_REFERENCE_START ) ; java.lang.StringBuilder . java.lang.StringBuilder ( ( int ) char ) ; java.lang.StringBuilder . java.lang.StringBuilder ( HtmlCharacterEntityReferences . REFERENCE_END ) ; } else { java.lang.StringBuilder . java.lang.StringBuilder ( char ) ; } } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String ( java.lang.String , WebUtils . DEFAULT_CHARACTER_ENCODING ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; if ( java.lang.String == null ) { return null ; } java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( java.lang.String . int ( ) * NUMBER ) ; for ( int int = NUMBER ; int < java.lang.String . int ( ) ; int ++ ) { char char = java.lang.String . char ( int ) ; if ( org.springframework.web.util.HtmlCharacterEntityReferences . isMappedToReference ( char , java.lang.String ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( HtmlCharacterEntityReferences . HEX_REFERENCE_START ) ; java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.Integer . java.lang.String ( char , NUMBER ) ) ; java.lang.StringBuilder . java.lang.StringBuilder ( HtmlCharacterEntityReferences . REFERENCE_END ) ; } else { java.lang.StringBuilder . java.lang.StringBuilder ( char ) ; } } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String ) { if ( java.lang.String == null ) { return null ; } return new HtmlCharacterEntityDecoder ( org.springframework.web.util.HtmlCharacterEntityReferences , java.lang.String ) . decode ( ) ; }  <METHOD_END>