<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) protected void void ( ) { this . org.springframework.web.servlet.tags.form.OptionsTag = new OptionsTag ( ) { @ java.lang.Override protected org.springframework.web.servlet.tags.form.TagWriter org.springframework.web.servlet.tags.form.TagWriter ( ) { return new TagWriter ( getWriter ( ) ) ; } } ; org.springframework.web.servlet.tags.form.SelectTag = new SelectTag ( ) { @ java.lang.Override protected org.springframework.web.servlet.tags.form.TagWriter org.springframework.web.servlet.tags.form.TagWriter ( ) { return new TagWriter ( getWriter ( ) ) ; } @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; } } ; org.springframework.web.servlet.tags.form.SelectTag . setPageContext ( getPageContext ( ) ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setParent ( org.springframework.web.servlet.tags.form.SelectTag ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setPageContext ( getPageContext ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.servlet.tags.form.TagWriter org.springframework.web.servlet.tags.form.TagWriter ( ) { return new TagWriter ( getWriter ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.servlet.tags.form.TagWriter org.springframework.web.servlet.tags.form.TagWriter ( ) { return new TagWriter ( getWriter ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { getPageContext ( ) . setAttribute ( SelectTag . LIST_VALUE_PAGE_ATTRIBUTE , new BindStatus ( getRequestContext ( ) , STRING , false ) ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setItems ( Country . getCountries ( ) ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setItemValue ( STRING ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setItemLabel ( STRING ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setId ( STRING ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setCssClass ( STRING ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setOnclick ( STRING ) ; int int = this . org.springframework.web.servlet.tags.form.OptionsTag . doStartTag ( ) ; assertEquals ( Tag . SKIP_BODY , int ) ; java.lang.String java.lang.String = getOutput ( ) ; java.lang.String = STRING + java.lang.String + STRING ; SAXReader org.springframework.web.servlet.tags.form.SAXReader = new SAXReader ( ) ; Document org.springframework.web.servlet.tags.form.Document = org.springframework.web.servlet.tags.form.SAXReader . read ( new java.io.StringReader ( java.lang.String ) ) ; Element org.springframework.web.servlet.tags.form.Element = org.springframework.web.servlet.tags.form.Document . getRootElement ( ) ; java.util.List java.util.List = org.springframework.web.servlet.tags.form.Element . elements ( ) ; assertEquals ( STRING , NUMBER , java.util.List . int ( ) ) ; Element org.springframework.web.servlet.tags.form.Element = ( Element ) org.springframework.web.servlet.tags.form.Element . selectSingleNode ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.web.servlet.tags.form.Element . attribute ( STRING ) . getValue ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.form.Element . attribute ( STRING ) . getValue ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.form.Element . attribute ( STRING ) . getValue ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.form.Element . attribute ( STRING ) . getValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; getPageContext ( ) . setAttribute ( SelectTag . LIST_VALUE_PAGE_ATTRIBUTE , new BindStatus ( getRequestContext ( ) , STRING , false ) ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setItems ( Country . getCountries ( ) ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setItemValue ( STRING ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setItemLabel ( STRING ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setId ( STRING ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setCssClass ( STRING ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setOnclick ( STRING ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setDynamicAttribute ( null , java.lang.String , java.lang.String ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setDynamicAttribute ( null , java.lang.String , java.lang.String ) ; int int = this . org.springframework.web.servlet.tags.form.OptionsTag . doStartTag ( ) ; assertEquals ( Tag . SKIP_BODY , int ) ; java.lang.String java.lang.String = getOutput ( ) ; java.lang.String = STRING + java.lang.String + STRING ; SAXReader org.springframework.web.servlet.tags.form.SAXReader = new SAXReader ( ) ; Document org.springframework.web.servlet.tags.form.Document = org.springframework.web.servlet.tags.form.SAXReader . read ( new java.io.StringReader ( java.lang.String ) ) ; Element org.springframework.web.servlet.tags.form.Element = org.springframework.web.servlet.tags.form.Document . getRootElement ( ) ; java.util.List java.util.List = org.springframework.web.servlet.tags.form.Element . elements ( ) ; assertEquals ( STRING , NUMBER , java.util.List . int ( ) ) ; Element org.springframework.web.servlet.tags.form.Element = ( Element ) org.springframework.web.servlet.tags.form.Element . selectSingleNode ( STRING ) ; assertEquals ( STRING , STRING , org.springframework.web.servlet.tags.form.Element . attribute ( STRING ) . getValue ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.form.Element . attribute ( STRING ) . getValue ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.form.Element . attribute ( STRING ) . getValue ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.form.Element . attribute ( STRING ) . getValue ( ) ) ; assertEquals ( java.lang.String , org.springframework.web.servlet.tags.form.Element . attribute ( java.lang.String ) . getValue ( ) ) ; assertEquals ( java.lang.String , org.springframework.web.servlet.tags.form.Element . attribute ( java.lang.String ) . getValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.beans.PropertyEditor java.beans.PropertyEditor = new SimpleFloatEditor ( ) ; TestBean org.springframework.web.servlet.tags.form.TestBean = new TestBean ( ) ; org.springframework.web.servlet.tags.form.TestBean . setMyFloat ( new java.lang.Float ( STRING ) ) ; BeanPropertyBindingResult org.springframework.web.servlet.tags.form.BeanPropertyBindingResult = new BeanPropertyBindingResult ( org.springframework.web.servlet.tags.form.TestBean , java.lang.String ) ; org.springframework.web.servlet.tags.form.BeanPropertyBindingResult . getPropertyAccessor ( ) . registerCustomEditor ( java.lang.Float .class , java.beans.PropertyEditor ) ; void ( org.springframework.web.servlet.tags.form.BeanPropertyBindingResult ) ; getPageContext ( ) . setAttribute ( SelectTag . LIST_VALUE_PAGE_ATTRIBUTE , new BindStatus ( getRequestContext ( ) , STRING , false ) ) ; java.util.List<java.lang.Float> < java.lang.Float > java.util.List<java.lang.Float> = new java.util.ArrayList<java.lang.Float> <> ( ) ; java.util.List<java.lang.Float> . boolean ( new java.lang.Float ( STRING ) ) ; java.util.List<java.lang.Float> . boolean ( new java.lang.Float ( STRING ) ) ; java.util.List<java.lang.Float> . boolean ( new java.lang.Float ( STRING ) ) ; java.util.List<java.lang.Float> . boolean ( new java.lang.Float ( STRING ) ) ; java.util.List<java.lang.Float> . boolean ( new java.lang.Float ( STRING ) ) ; java.util.List<java.lang.Float> . boolean ( new java.lang.Float ( STRING ) ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setItems ( java.util.List<java.lang.Float> ) ; int int = this . org.springframework.web.servlet.tags.form.OptionsTag . doStartTag ( ) ; assertEquals ( Tag . SKIP_BODY , int ) ; java.lang.String java.lang.String = getOutput ( ) ; java.lang.String = STRING + java.lang.String + STRING ; SAXReader org.springframework.web.servlet.tags.form.SAXReader = new SAXReader ( ) ; Document org.springframework.web.servlet.tags.form.Document = org.springframework.web.servlet.tags.form.SAXReader . read ( new java.io.StringReader ( java.lang.String ) ) ; Element org.springframework.web.servlet.tags.form.Element = org.springframework.web.servlet.tags.form.Document . getRootElement ( ) ; java.util.List java.util.List = org.springframework.web.servlet.tags.form.Element . elements ( ) ; assertEquals ( STRING , NUMBER , java.util.List . int ( ) ) ; Element org.springframework.web.servlet.tags.form.Element = ( Element ) org.springframework.web.servlet.tags.form.Element . selectSingleNode ( STRING ) ; assertNotNull ( STRING , org.springframework.web.servlet.tags.form.Element ) ; assertEquals ( STRING , STRING , org.springframework.web.servlet.tags.form.Element . attribute ( STRING ) . getValue ( ) ) ; assertNull ( STRING , org.springframework.web.servlet.tags.form.Element . attribute ( STRING ) ) ; org.springframework.web.servlet.tags.form.Element = ( Element ) org.springframework.web.servlet.tags.form.Element . selectSingleNode ( STRING ) ; assertNotNull ( STRING , org.springframework.web.servlet.tags.form.Element ) ; assertNull ( STRING , org.springframework.web.servlet.tags.form.Element . attribute ( STRING ) ) ; assertNull ( STRING , org.springframework.web.servlet.tags.form.Element . attribute ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { getPageContext ( ) . setAttribute ( SelectTag . LIST_VALUE_PAGE_ATTRIBUTE , new BindStatus ( getRequestContext ( ) , STRING , false ) ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setItems ( java.util.Collections . java.util.List<java.lang.Object> ( ) ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setItemValue ( STRING ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setItemLabel ( STRING ) ; int int = this . org.springframework.web.servlet.tags.form.OptionsTag . doStartTag ( ) ; assertEquals ( Tag . SKIP_BODY , int ) ; java.lang.String java.lang.String = getOutput ( ) ; java.lang.String = STRING + java.lang.String + STRING ; SAXReader org.springframework.web.servlet.tags.form.SAXReader = new SAXReader ( ) ; Document org.springframework.web.servlet.tags.form.Document = org.springframework.web.servlet.tags.form.SAXReader . read ( new java.io.StringReader ( java.lang.String ) ) ; Element org.springframework.web.servlet.tags.form.Element = org.springframework.web.servlet.tags.form.Document . getRootElement ( ) ; java.util.List java.util.List = org.springframework.web.servlet.tags.form.Element . elements ( ) ; assertEquals ( STRING , NUMBER , java.util.List . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.tags.form.OptionsTag . setItemValue ( STRING ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setItemLabel ( STRING ) ; this . org.springframework.web.servlet.tags.form.SelectTag . setPath ( STRING ) ; this . org.springframework.web.servlet.tags.form.SelectTag . doStartTag ( ) ; int int = this . org.springframework.web.servlet.tags.form.OptionsTag . doStartTag ( ) ; assertEquals ( Tag . SKIP_BODY , int ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . doEndTag ( ) ; this . org.springframework.web.servlet.tags.form.SelectTag . doEndTag ( ) ; java.lang.String java.lang.String = getOutput ( ) ; SAXReader org.springframework.web.servlet.tags.form.SAXReader = new SAXReader ( ) ; Document org.springframework.web.servlet.tags.form.Document = org.springframework.web.servlet.tags.form.SAXReader . read ( new java.io.StringReader ( java.lang.String ) ) ; Element org.springframework.web.servlet.tags.form.Element = org.springframework.web.servlet.tags.form.Document . getRootElement ( ) ; java.util.List java.util.List = org.springframework.web.servlet.tags.form.Element . elements ( ) ; assertEquals ( STRING , NUMBER , java.util.List . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanWithEnum org.springframework.web.servlet.tags.form.BeanWithEnum = new BeanWithEnum ( ) ; org.springframework.web.servlet.tags.form.BeanWithEnum . setTestEnum ( TestEnum . VALUE_2 ) ; getPageContext ( ) . getRequest ( ) . setAttribute ( STRING , org.springframework.web.servlet.tags.form.BeanWithEnum ) ; this . org.springframework.web.servlet.tags.form.SelectTag . setPath ( STRING ) ; this . org.springframework.web.servlet.tags.form.SelectTag . doStartTag ( ) ; int int = this . org.springframework.web.servlet.tags.form.OptionsTag . doStartTag ( ) ; assertEquals ( BodyTag . SKIP_BODY , int ) ; int = this . org.springframework.web.servlet.tags.form.OptionsTag . doEndTag ( ) ; assertEquals ( Tag . EVAL_PAGE , int ) ; this . org.springframework.web.servlet.tags.form.SelectTag . doEndTag ( ) ; java.lang.String java.lang.String = getWriter ( ) . toString ( ) ; SAXReader org.springframework.web.servlet.tags.form.SAXReader = new SAXReader ( ) ; Document org.springframework.web.servlet.tags.form.Document = org.springframework.web.servlet.tags.form.SAXReader . read ( new java.io.StringReader ( java.lang.String ) ) ; Element org.springframework.web.servlet.tags.form.Element = org.springframework.web.servlet.tags.form.Document . getRootElement ( ) ; assertEquals ( NUMBER , org.springframework.web.servlet.tags.form.Element . elements ( ) . size ( ) ) ; Node org.springframework.web.servlet.tags.form.Node = org.springframework.web.servlet.tags.form.Element . selectSingleNode ( STRING ) ; Node org.springframework.web.servlet.tags.form.Node = org.springframework.web.servlet.tags.form.Element . selectSingleNode ( STRING ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.form.Node . getText ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.form.Node . getText ( ) ) ; assertEquals ( org.springframework.web.servlet.tags.form.Node , org.springframework.web.servlet.tags.form.Element . selectSingleNode ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanWithEnum org.springframework.web.servlet.tags.form.BeanWithEnum = new BeanWithEnum ( ) ; org.springframework.web.servlet.tags.form.BeanWithEnum . setTestEnum ( TestEnum . VALUE_2 ) ; getPageContext ( ) . getRequest ( ) . setAttribute ( STRING , org.springframework.web.servlet.tags.form.BeanWithEnum ) ; this . org.springframework.web.servlet.tags.form.SelectTag . setPath ( STRING ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setItemLabel ( STRING ) ; this . org.springframework.web.servlet.tags.form.OptionsTag . setItemValue ( STRING ) ; this . org.springframework.web.servlet.tags.form.SelectTag . doStartTag ( ) ; int int = this . org.springframework.web.servlet.tags.form.OptionsTag . doStartTag ( ) ; assertEquals ( BodyTag . SKIP_BODY , int ) ; int = this . org.springframework.web.servlet.tags.form.OptionsTag . doEndTag ( ) ; assertEquals ( Tag . EVAL_PAGE , int ) ; this . org.springframework.web.servlet.tags.form.SelectTag . doEndTag ( ) ; java.lang.String java.lang.String = getWriter ( ) . toString ( ) ; SAXReader org.springframework.web.servlet.tags.form.SAXReader = new SAXReader ( ) ; Document org.springframework.web.servlet.tags.form.Document = org.springframework.web.servlet.tags.form.SAXReader . read ( new java.io.StringReader ( java.lang.String ) ) ; Element org.springframework.web.servlet.tags.form.Element = org.springframework.web.servlet.tags.form.Document . getRootElement ( ) ; assertEquals ( NUMBER , org.springframework.web.servlet.tags.form.Element . elements ( ) . size ( ) ) ; Node org.springframework.web.servlet.tags.form.Node = org.springframework.web.servlet.tags.form.Element . selectSingleNode ( STRING ) ; Node org.springframework.web.servlet.tags.form.Node = org.springframework.web.servlet.tags.form.Element . selectSingleNode ( STRING ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.form.Node . getText ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.tags.form.Node . getText ( ) ) ; assertEquals ( org.springframework.web.servlet.tags.form.Node , org.springframework.web.servlet.tags.form.Element . selectSingleNode ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( MockHttpServletRequest org.springframework.web.servlet.tags.form.MockHttpServletRequest ) { TestBean org.springframework.web.servlet.tags.form.TestBean = new TestBean ( ) ; org.springframework.web.servlet.tags.form.TestBean . setName ( STRING ) ; org.springframework.web.servlet.tags.form.TestBean . setCountry ( STRING ) ; org.springframework.web.servlet.tags.form.TestBean . setMyFloat ( new java.lang.Float ( STRING ) ) ; org.springframework.web.servlet.tags.form.MockHttpServletRequest . setAttribute ( java.lang.String , org.springframework.web.servlet.tags.form.TestBean ) ; java.util.List java.util.List = new java.util.ArrayList ( ) ; java.util.List . boolean ( new java.lang.Float ( STRING ) ) ; java.util.List . boolean ( new java.lang.Float ( STRING ) ) ; java.util.List . boolean ( new java.lang.Float ( STRING ) ) ; java.util.List . boolean ( new java.lang.Float ( STRING ) ) ; java.util.List . boolean ( new java.lang.Float ( STRING ) ) ; java.util.List . boolean ( new java.lang.Float ( STRING ) ) ; org.springframework.web.servlet.tags.form.MockHttpServletRequest . setAttribute ( STRING , java.util.List ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( Errors org.springframework.web.servlet.tags.form.Errors ) { java.util.Map java.util.Map = new java.util.HashMap ( ) ; java.util.Map . java.lang.Object ( BindingResult . MODEL_KEY_PREFIX + java.lang.String , org.springframework.web.servlet.tags.form.Errors ) ; MockPageContext org.springframework.web.servlet.tags.form.MockPageContext = getPageContext ( ) ; RequestContext org.springframework.web.servlet.tags.form.RequestContext = new RequestContext ( ( HttpServletRequest ) org.springframework.web.servlet.tags.form.MockPageContext . getRequest ( ) , java.util.Map ) ; org.springframework.web.servlet.tags.form.MockPageContext . setAttribute ( RequestContextAwareTag . REQUEST_CONTEXT_PAGE_ATTRIBUTE , org.springframework.web.servlet.tags.form.RequestContext ) ; }  <METHOD_END>
