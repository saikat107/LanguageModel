<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestBean org.springframework.web.bind.support.TestBean = new TestBean ( ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.TestBean , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . registerCustomEditor ( ITestBean .class , new java.beans.PropertyEditorSupport ( ) { @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.lang.IllegalArgumentException { void ( new TestBean ( ) ) ; } } ) ; MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertNotNull ( org.springframework.web.bind.support.TestBean . getSpouse ( ) ) ; assertEquals ( STRING , org.springframework.web.bind.support.TestBean . getSpouse ( ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.lang.IllegalArgumentException { void ( new TestBean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestBean org.springframework.web.bind.support.TestBean = new org.springframework.web.bind.support.WebRequestDataBinderTests.TestBeanWithConcreteSpouse ( ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.TestBean , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . setIgnoreUnknownFields ( false ) ; MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertNotNull ( org.springframework.web.bind.support.TestBean . getSpouse ( ) ) ; assertEquals ( STRING , org.springframework.web.bind.support.TestBean . getSpouse ( ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestBean org.springframework.web.bind.support.TestBean = new TestBean ( ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.TestBean ) ; MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertTrue ( org.springframework.web.bind.support.TestBean . isPostProcessed ( ) ) ; org.springframework.web.bind.support.MockHttpServletRequest . removeParameter ( STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertFalse ( org.springframework.web.bind.support.TestBean . isPostProcessed ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestBean org.springframework.web.bind.support.TestBean = new TestBean ( ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.TestBean ) ; org.springframework.web.bind.support.WebRequestDataBinder . setIgnoreUnknownFields ( false ) ; MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertTrue ( org.springframework.web.bind.support.TestBean . isPostProcessed ( ) ) ; org.springframework.web.bind.support.MockHttpServletRequest . removeParameter ( STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertFalse ( org.springframework.web.bind.support.TestBean . isPostProcessed ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestBean org.springframework.web.bind.support.TestBean = new TestBean ( ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.TestBean ) ; MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertTrue ( org.springframework.web.bind.support.TestBean . isPostProcessed ( ) ) ; org.springframework.web.bind.support.MockHttpServletRequest . removeParameter ( STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertFalse ( org.springframework.web.bind.support.TestBean . isPostProcessed ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestBean org.springframework.web.bind.support.TestBean = new TestBean ( ) ; org.springframework.web.bind.support.TestBean . setSomeSet ( null ) ; org.springframework.web.bind.support.TestBean . setSomeList ( null ) ; org.springframework.web.bind.support.TestBean . setSomeMap ( null ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.TestBean ) ; MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertThat ( org.springframework.web.bind.support.TestBean . getSomeSet ( ) , notNullValue ( ) ) ; assertThat ( org.springframework.web.bind.support.TestBean . getSomeSet ( ) , isA ( java.util.Set .class ) ) ; assertThat ( org.springframework.web.bind.support.TestBean . getSomeList ( ) , notNullValue ( ) ) ; assertThat ( org.springframework.web.bind.support.TestBean . getSomeList ( ) , isA ( java.util.List .class ) ) ; assertThat ( org.springframework.web.bind.support.TestBean . getSomeMap ( ) , notNullValue ( ) ) ; assertThat ( org.springframework.web.bind.support.TestBean . getSomeMap ( ) , isA ( java.util.Map .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestBean org.springframework.web.bind.support.TestBean = new TestBean ( ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.TestBean ) ; MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertTrue ( org.springframework.web.bind.support.TestBean . isPostProcessed ( ) ) ; org.springframework.web.bind.support.MockHttpServletRequest . removeParameter ( STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertTrue ( org.springframework.web.bind.support.TestBean . isPostProcessed ( ) ) ; org.springframework.web.bind.support.MockHttpServletRequest . removeParameter ( STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertFalse ( org.springframework.web.bind.support.TestBean . isPostProcessed ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestBean org.springframework.web.bind.support.TestBean = new TestBean ( ) ; org.springframework.web.bind.support.TestBean . setSpouse ( new TestBean ( ) ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.TestBean ) ; MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertTrue ( ( ( TestBean ) org.springframework.web.bind.support.TestBean . getSpouse ( ) ) . isPostProcessed ( ) ) ; org.springframework.web.bind.support.MockHttpServletRequest . removeParameter ( STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertTrue ( ( ( TestBean ) org.springframework.web.bind.support.TestBean . getSpouse ( ) ) . isPostProcessed ( ) ) ; org.springframework.web.bind.support.MockHttpServletRequest . removeParameter ( STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertFalse ( ( ( TestBean ) org.springframework.web.bind.support.TestBean . getSpouse ( ) ) . isPostProcessed ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestBean org.springframework.web.bind.support.TestBean = new TestBean ( ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.TestBean ) ; MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertEquals ( STRING , org.springframework.web.bind.support.TestBean . getName ( ) ) ; org.springframework.web.bind.support.MockHttpServletRequest . removeParameter ( STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertEquals ( STRING , org.springframework.web.bind.support.TestBean . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestBean org.springframework.web.bind.support.TestBean = new TestBean ( ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.TestBean ) ; MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertEquals ( STRING , NUMBER , org.springframework.web.bind.support.TestBean . getStringArray ( ) . length ) ; org.springframework.web.bind.support.MockHttpServletRequest . removeParameter ( STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertEquals ( STRING , NUMBER , org.springframework.web.bind.support.TestBean . getStringArray ( ) . length ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.web.bind.support.WebRequestDataBinderTests.EnumHolder org.springframework.web.bind.support.WebRequestDataBinderTests.EnumHolder = new org.springframework.web.bind.support.WebRequestDataBinderTests.EnumHolder ( ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.WebRequestDataBinderTests.EnumHolder ) ; MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockHttpServletRequest ) ) ; assertEquals ( org.springframework.web.bind.support.WebRequestDataBinderTests.MyEnum . org.springframework.web.bind.support.WebRequestDataBinderTests.MyEnum , org.springframework.web.bind.support.WebRequestDataBinderTests.EnumHolder . org.springframework.web.bind.support.WebRequestDataBinderTests.MyEnum ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.web.bind.support.TestBean = new TestBean ( ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.TestBean ) ; org.springframework.web.bind.support.WebRequestDataBinder . registerCustomEditor ( java.lang.String .class , new StringMultipartFileEditor ( ) ) ; MockMultipartHttpServletRequest org.springframework.web.bind.support.MockMultipartHttpServletRequest = new MockMultipartHttpServletRequest ( ) ; org.springframework.web.bind.support.MockMultipartHttpServletRequest . addFile ( new MockMultipartFile ( STRING , STRING . byte[] ( ) ) ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockMultipartHttpServletRequest ) ) ; assertEquals ( STRING , org.springframework.web.bind.support.TestBean . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.web.bind.support.TestBean = new TestBean ( ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.TestBean ) ; org.springframework.web.bind.support.WebRequestDataBinder . registerCustomEditor ( java.lang.String .class , new StringMultipartFileEditor ( ) ) ; MockMultipartHttpServletRequest org.springframework.web.bind.support.MockMultipartHttpServletRequest = new MockMultipartHttpServletRequest ( ) ; org.springframework.web.bind.support.MockMultipartHttpServletRequest . addFile ( new MockMultipartFile ( STRING , STRING . byte[] ( ) ) ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockMultipartHttpServletRequest ) ) ; assertEquals ( NUMBER , org.springframework.web.bind.support.TestBean . getStringArray ( ) . length ) ; assertEquals ( STRING , org.springframework.web.bind.support.TestBean . getStringArray ( ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { TestBean org.springframework.web.bind.support.TestBean = new TestBean ( ) ; WebRequestDataBinder org.springframework.web.bind.support.WebRequestDataBinder = new WebRequestDataBinder ( org.springframework.web.bind.support.TestBean ) ; org.springframework.web.bind.support.WebRequestDataBinder . registerCustomEditor ( java.lang.String .class , new StringMultipartFileEditor ( ) ) ; MockMultipartHttpServletRequest org.springframework.web.bind.support.MockMultipartHttpServletRequest = new MockMultipartHttpServletRequest ( ) ; org.springframework.web.bind.support.MockMultipartHttpServletRequest . addFile ( new MockMultipartFile ( STRING , STRING . byte[] ( ) ) ) ; org.springframework.web.bind.support.MockMultipartHttpServletRequest . addFile ( new MockMultipartFile ( STRING , STRING . byte[] ( ) ) ) ; org.springframework.web.bind.support.WebRequestDataBinder . bind ( new ServletWebRequest ( org.springframework.web.bind.support.MockMultipartHttpServletRequest ) ) ; assertEquals ( NUMBER , org.springframework.web.bind.support.TestBean . getStringArray ( ) . length ) ; assertEquals ( STRING , org.springframework.web.bind.support.TestBean . getStringArray ( ) [ NUMBER ] ) ; assertEquals ( STRING , org.springframework.web.bind.support.TestBean . getStringArray ( ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING + NUMBER ) ; ServletRequestParameterPropertyValues org.springframework.web.bind.support.ServletRequestParameterPropertyValues = new ServletRequestParameterPropertyValues ( org.springframework.web.bind.support.MockHttpServletRequest ) ; void ( org.springframework.web.bind.support.ServletRequestParameterPropertyValues ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING ) ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , STRING + NUMBER ) ; ServletRequestParameterPropertyValues org.springframework.web.bind.support.ServletRequestParameterPropertyValues = new ServletRequestParameterPropertyValues ( org.springframework.web.bind.support.MockHttpServletRequest ) ; assertTrue ( STRING , ! org.springframework.web.bind.support.ServletRequestParameterPropertyValues . contains ( STRING ) ) ; assertTrue ( STRING , org.springframework.web.bind.support.ServletRequestParameterPropertyValues . contains ( STRING ) ) ; org.springframework.web.bind.support.ServletRequestParameterPropertyValues = new ServletRequestParameterPropertyValues ( org.springframework.web.bind.support.MockHttpServletRequest , STRING ) ; void ( org.springframework.web.bind.support.ServletRequestParameterPropertyValues ) ; }  <METHOD_END>
<METHOD_START> protected void void ( PropertyValues org.springframework.web.bind.support.PropertyValues ) throws java.lang.Exception { assertTrue ( STRING , org.springframework.web.bind.support.PropertyValues . getPropertyValues ( ) . length == NUMBER ) ; assertTrue ( STRING , org.springframework.web.bind.support.PropertyValues . contains ( STRING ) ) ; assertTrue ( STRING , org.springframework.web.bind.support.PropertyValues . contains ( STRING ) ) ; assertTrue ( STRING , org.springframework.web.bind.support.PropertyValues . contains ( STRING ) ) ; assertTrue ( STRING , ! org.springframework.web.bind.support.PropertyValues . contains ( STRING ) ) ; PropertyValue [] org.springframework.web.bind.support.PropertyValue[] = org.springframework.web.bind.support.PropertyValues . getPropertyValues ( ) ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( STRING , STRING ) ; for ( PropertyValue org.springframework.web.bind.support.PropertyValue : org.springframework.web.bind.support.PropertyValue[] ) { java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( org.springframework.web.bind.support.PropertyValue . getName ( ) ) ; assertTrue ( STRING , java.lang.Object != null ) ; assertTrue ( STRING , java.lang.Object instanceof java.lang.String ) ; assertTrue ( STRING , java.lang.Object . boolean ( org.springframework.web.bind.support.PropertyValue . getValue ( ) ) ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( org.springframework.web.bind.support.PropertyValue . getName ( ) ) ; } assertTrue ( STRING , java.util.Map<java.lang.String,java.lang.String> . int ( ) == NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; ServletRequestParameterPropertyValues org.springframework.web.bind.support.ServletRequestParameterPropertyValues = new ServletRequestParameterPropertyValues ( org.springframework.web.bind.support.MockHttpServletRequest ) ; assertTrue ( STRING , org.springframework.web.bind.support.ServletRequestParameterPropertyValues . getPropertyValues ( ) . length == NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.web.bind.support.MockHttpServletRequest = new MockHttpServletRequest ( ) ; java.lang.String [] java.lang.String[] = new java.lang.String [] { STRING , STRING } ; org.springframework.web.bind.support.MockHttpServletRequest . addParameter ( STRING , java.lang.String[] ) ; ServletRequestParameterPropertyValues org.springframework.web.bind.support.ServletRequestParameterPropertyValues = new ServletRequestParameterPropertyValues ( org.springframework.web.bind.support.MockHttpServletRequest ) ; assertTrue ( STRING , org.springframework.web.bind.support.ServletRequestParameterPropertyValues . getPropertyValues ( ) . length == NUMBER ) ; assertTrue ( STRING , org.springframework.web.bind.support.ServletRequestParameterPropertyValues . getPropertyValue ( STRING ) . getValue ( ) instanceof java.lang.String [] ) ; java.lang.String [] java.lang.String[] = ( java.lang.String [] ) org.springframework.web.bind.support.ServletRequestParameterPropertyValues . getPropertyValue ( STRING ) . getValue ( ) ; assertEquals ( STRING , java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) , java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.bind.support.WebRequestDataBinderTests.MyEnum org.springframework.web.bind.support.WebRequestDataBinderTests.MyEnum ( ) { return org.springframework.web.bind.support.WebRequestDataBinderTests.MyEnum ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.web.bind.support.WebRequestDataBinderTests.MyEnum org.springframework.web.bind.support.WebRequestDataBinderTests.MyEnum ) { this . org.springframework.web.bind.support.WebRequestDataBinderTests.MyEnum = org.springframework.web.bind.support.WebRequestDataBinderTests.MyEnum ; }  <METHOD_END>
<METHOD_START> public void void ( TestBean org.springframework.web.bind.support.TestBean ) { setSpouse ( org.springframework.web.bind.support.TestBean ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.bind.support.TestBean org.springframework.web.bind.support.TestBean ( ) { return ( TestBean ) getSpouse ( ) ; }  <METHOD_END>
