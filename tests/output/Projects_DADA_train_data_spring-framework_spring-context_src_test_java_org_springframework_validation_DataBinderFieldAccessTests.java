<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldAccessBean org.springframework.validation.FieldAccessBean = new FieldAccessBean ( ) ; DataBinder org.springframework.validation.DataBinder = new DataBinder ( org.springframework.validation.FieldAccessBean , STRING ) ; assertTrue ( org.springframework.validation.DataBinder . isIgnoreUnknownFields ( ) ) ; org.springframework.validation.DataBinder . initDirectFieldAccess ( ) ; MutablePropertyValues org.springframework.validation.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , STRING ) ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , new java.lang.Integer ( NUMBER ) ) ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , STRING ) ) ; org.springframework.validation.DataBinder . bind ( org.springframework.validation.MutablePropertyValues ) ; org.springframework.validation.DataBinder . close ( ) ; assertTrue ( STRING , org.springframework.validation.FieldAccessBean . getName ( ) . equals ( STRING ) ) ; assertTrue ( STRING , org.springframework.validation.FieldAccessBean . getAge ( ) == NUMBER ) ; java.util.Map<?,?> < ? , ? > java.util.Map<?,?> = org.springframework.validation.DataBinder . getBindingResult ( ) . getModel ( ) ; assertTrue ( STRING , java.util.Map<,> . int ( ) == NUMBER ) ; FieldAccessBean org.springframework.validation.FieldAccessBean = ( FieldAccessBean ) java.util.Map<,> . get ( STRING ) ; assertTrue ( STRING , org.springframework.validation.FieldAccessBean . equals ( org.springframework.validation.FieldAccessBean ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldAccessBean org.springframework.validation.FieldAccessBean = new FieldAccessBean ( ) ; DataBinder org.springframework.validation.DataBinder = new DataBinder ( org.springframework.validation.FieldAccessBean , STRING ) ; org.springframework.validation.DataBinder . initDirectFieldAccess ( ) ; org.springframework.validation.DataBinder . setIgnoreUnknownFields ( false ) ; MutablePropertyValues org.springframework.validation.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , STRING ) ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , new java.lang.Integer ( NUMBER ) ) ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , STRING ) ) ; try { org.springframework.validation.DataBinder . bind ( org.springframework.validation.MutablePropertyValues ) ; fail ( STRING ) ; } catch ( NotWritablePropertyException org.springframework.validation.NotWritablePropertyException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldAccessBean org.springframework.validation.FieldAccessBean = new FieldAccessBean ( ) ; DataBinder org.springframework.validation.DataBinder = new DataBinder ( org.springframework.validation.FieldAccessBean , STRING ) ; org.springframework.validation.DataBinder . initDirectFieldAccess ( ) ; MutablePropertyValues org.springframework.validation.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , STRING ) ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , STRING ) ) ; org.springframework.validation.DataBinder . bind ( org.springframework.validation.MutablePropertyValues ) ; try { org.springframework.validation.DataBinder . close ( ) ; fail ( STRING ) ; } catch ( BindException org.springframework.validation.BindException ) { assertTrue ( STRING , org.springframework.validation.FieldAccessBean . getName ( ) . equals ( STRING ) ) ; java.util.Map<?,?> < ? , ? > java.util.Map<?,?> = org.springframework.validation.DataBinder . getBindingResult ( ) . getModel ( ) ; FieldAccessBean org.springframework.validation.FieldAccessBean = ( FieldAccessBean ) java.util.Map<,> . get ( STRING ) ; assertTrue ( STRING , org.springframework.validation.FieldAccessBean . equals ( org.springframework.validation.FieldAccessBean ) ) ; BindingResult org.springframework.validation.BindingResult = ( BindingResult ) java.util.Map<,> . get ( BindingResult . MODEL_KEY_PREFIX + STRING ) ; assertTrue ( STRING , org.springframework.validation.BindingResult == org.springframework.validation.DataBinder . getBindingResult ( ) ) ; assertTrue ( org.springframework.validation.BindingResult . hasErrors ( ) ) ; assertTrue ( STRING , org.springframework.validation.BindingResult . getErrorCount ( ) == NUMBER ) ; assertTrue ( STRING , org.springframework.validation.BindingResult . hasFieldErrors ( STRING ) ) ; assertTrue ( STRING , org.springframework.validation.BindingResult . getFieldErrorCount ( STRING ) == NUMBER ) ; assertEquals ( STRING , org.springframework.validation.DataBinder . getBindingResult ( ) . getFieldValue ( STRING ) ) ; assertEquals ( STRING , org.springframework.validation.DataBinder . getBindingResult ( ) . getFieldError ( STRING ) . getRejectedValue ( ) ) ; assertEquals ( NUMBER , org.springframework.validation.FieldAccessBean . getAge ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldAccessBean org.springframework.validation.FieldAccessBean = new FieldAccessBean ( ) ; DataBinder org.springframework.validation.DataBinder = new DataBinder ( org.springframework.validation.FieldAccessBean , STRING ) ; assertTrue ( org.springframework.validation.DataBinder . isIgnoreUnknownFields ( ) ) ; org.springframework.validation.DataBinder . initDirectFieldAccess ( ) ; MutablePropertyValues org.springframework.validation.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , STRING ) ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , STRING ) ) ; org.springframework.validation.DataBinder . bind ( org.springframework.validation.MutablePropertyValues ) ; org.springframework.validation.DataBinder . close ( ) ; assertEquals ( STRING , org.springframework.validation.FieldAccessBean . getSpouse ( ) . getName ( ) ) ; assertTrue ( ( org.springframework.validation.FieldAccessBean . getSpouse ( ) ) . isJedi ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldAccessBean org.springframework.validation.FieldAccessBean = new FieldAccessBean ( ) ; DataBinder org.springframework.validation.DataBinder = new DataBinder ( org.springframework.validation.FieldAccessBean , STRING ) ; org.springframework.validation.DataBinder . setAutoGrowNestedPaths ( false ) ; org.springframework.validation.DataBinder . initDirectFieldAccess ( ) ; MutablePropertyValues org.springframework.validation.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , STRING ) ) ; org.springframework.validation.ExpectedException . expect ( NullValueInNestedPathException .class ) ; org.springframework.validation.DataBinder . bind ( org.springframework.validation.MutablePropertyValues ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { FieldAccessBean org.springframework.validation.FieldAccessBean = new FieldAccessBean ( ) ; DataBinder org.springframework.validation.DataBinder = new DataBinder ( org.springframework.validation.FieldAccessBean , STRING ) ; org.springframework.validation.DataBinder . initDirectFieldAccess ( ) ; org.springframework.validation.DataBinder . registerCustomEditor ( TestBean .class , STRING , new java.beans.PropertyEditorSupport ( ) { @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.lang.IllegalArgumentException { void ( new TestBean ( java.lang.String , NUMBER ) ) ; } @ java.lang.Override public java.lang.String java.lang.String ( ) { return ( ( TestBean ) java.lang.Object ( ) ) . getName ( ) ; } } ) ; MutablePropertyValues org.springframework.validation.MutablePropertyValues = new MutablePropertyValues ( ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , STRING ) ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , STRING ) ) ; org.springframework.validation.MutablePropertyValues . addPropertyValue ( new PropertyValue ( STRING , STRING ) ) ; org.springframework.validation.DataBinder . bind ( org.springframework.validation.MutablePropertyValues ) ; try { org.springframework.validation.DataBinder . close ( ) ; fail ( STRING ) ; } catch ( BindException org.springframework.validation.BindException ) { assertTrue ( STRING , org.springframework.validation.FieldAccessBean . getName ( ) . equals ( STRING ) ) ; java.util.Map<?,?> < ? , ? > java.util.Map<?,?> = org.springframework.validation.DataBinder . getBindingResult ( ) . getModel ( ) ; FieldAccessBean org.springframework.validation.FieldAccessBean = ( FieldAccessBean ) java.util.Map<,> . get ( STRING ) ; assertTrue ( STRING , org.springframework.validation.FieldAccessBean . equals ( org.springframework.validation.FieldAccessBean ) ) ; BindingResult org.springframework.validation.BindingResult = ( BindingResult ) java.util.Map<,> . get ( BindingResult . MODEL_KEY_PREFIX + STRING ) ; assertTrue ( STRING , org.springframework.validation.BindingResult == org.springframework.validation.DataBinder . getBindingResult ( ) ) ; assertTrue ( org.springframework.validation.BindingResult . hasErrors ( ) ) ; assertTrue ( STRING , org.springframework.validation.BindingResult . getErrorCount ( ) == NUMBER ) ; assertTrue ( STRING , org.springframework.validation.BindingResult . hasFieldErrors ( STRING ) ) ; assertTrue ( STRING , org.springframework.validation.BindingResult . getFieldErrorCount ( STRING ) == NUMBER ) ; assertEquals ( STRING , org.springframework.validation.DataBinder . getBindingResult ( ) . getFieldValue ( STRING ) ) ; assertEquals ( STRING , org.springframework.validation.DataBinder . getBindingResult ( ) . getFieldError ( STRING ) . getRejectedValue ( ) ) ; assertEquals ( NUMBER , org.springframework.validation.FieldAccessBean . getAge ( ) ) ; assertTrue ( STRING , ! org.springframework.validation.BindingResult . hasFieldErrors ( STRING ) ) ; assertEquals ( STRING , org.springframework.validation.DataBinder . getBindingResult ( ) . getFieldValue ( STRING ) ) ; assertNotNull ( org.springframework.validation.FieldAccessBean . getSpouse ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.lang.IllegalArgumentException { void ( new TestBean ( java.lang.String , NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return ( ( TestBean ) java.lang.Object ( ) ) . getName ( ) ; }  <METHOD_END>