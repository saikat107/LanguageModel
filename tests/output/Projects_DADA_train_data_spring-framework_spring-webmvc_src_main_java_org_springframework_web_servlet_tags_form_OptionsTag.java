<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected int int ( TagWriter org.springframework.web.servlet.tags.form.TagWriter ) throws org.springframework.web.servlet.tags.form.JspException { SelectTag org.springframework.web.servlet.tags.form.SelectTag = org.springframework.web.servlet.tags.form.SelectTag ( ) ; java.lang.Object java.lang.Object = java.lang.Object ( ) ; java.lang.Object java.lang.Object = null ; if ( java.lang.Object != null ) { java.lang.Object = ( java.lang.Object instanceof java.lang.String ? evaluate ( STRING , java.lang.Object ) : java.lang.Object ) ; } else { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.web.servlet.tags.form.SelectTag . getBindStatus ( ) . getValueType ( ) ; if ( java.lang.Class<> != null && java.lang.Class<> . boolean ( ) ) { java.lang.Object = java.lang.Class<> . getEnumConstants ( ) ; } } if ( java.lang.Object != null ) { java.lang.String java.lang.String = org.springframework.web.servlet.tags.form.SelectTag . getName ( ) ; java.lang.String java.lang.String = java.lang.String ( ) ; java.lang.String java.lang.String = java.lang.String ( ) ; java.lang.String java.lang.String = ( java.lang.String != null ? ObjectUtils . getDisplayString ( evaluate ( STRING , java.lang.String ) ) : null ) ; java.lang.String java.lang.String = ( java.lang.String != null ? ObjectUtils . getDisplayString ( evaluate ( STRING , java.lang.String ) ) : null ) ; org.springframework.web.servlet.tags.form.OptionsTag.OptionsWriter org.springframework.web.servlet.tags.form.OptionsTag.OptionsWriter = new org.springframework.web.servlet.tags.form.OptionsTag.OptionsWriter ( java.lang.String , java.lang.Object , java.lang.String , java.lang.String ) ; org.springframework.web.servlet.tags.form.OptionsTag.OptionsWriter . writeOptions ( org.springframework.web.servlet.tags.form.TagWriter ) ; } return SKIP_BODY ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) org.springframework.web.servlet.tags.form.JspException { java.lang.Object java.lang.Object = evaluate ( STRING , getId ( ) ) ; if ( java.lang.Object != null ) { java.lang.String java.lang.String = java.lang.Object . java.lang.String ( ) ; return ( StringUtils . hasText ( java.lang.String ) ? TagIdGenerator . nextId ( java.lang.String , this . pageContext ) : null ) ; } return null ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.tags.form.SelectTag org.springframework.web.servlet.tags.form.SelectTag ( ) { TagUtils . assertHasAncestorOfType ( this , SelectTag .class , STRING , STRING ) ; return ( SelectTag ) findAncestorWithClass ( this , SelectTag .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.servlet.tags.form.BindStatus org.springframework.web.servlet.tags.form.BindStatus ( ) { return ( BindStatus ) this . pageContext . getAttribute ( SelectTag . LIST_VALUE_PAGE_ATTRIBUTE ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , java.lang.String java.lang.String , java.lang.String java.lang.String ) { super( java.lang.Object , org.springframework.web.servlet.tags.form.BindStatus ( ) , java.lang.String , java.lang.String , isHtmlEscape ( ) ); this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) org.springframework.web.servlet.tags.form.JspException { return boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( TagWriter org.springframework.web.servlet.tags.form.TagWriter ) throws org.springframework.web.servlet.tags.form.JspException { writeOptionalAttribute ( org.springframework.web.servlet.tags.form.TagWriter , STRING , java.lang.String ( ) ) ; writeOptionalAttributes ( org.springframework.web.servlet.tags.form.TagWriter ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return processFieldValue ( this . java.lang.String , java.lang.String , STRING ) ; }  <METHOD_END>
