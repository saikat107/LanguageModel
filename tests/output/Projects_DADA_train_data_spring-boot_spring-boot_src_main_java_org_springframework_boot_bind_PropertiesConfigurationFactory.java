<METHOD_START> public void ( T T ) { Assert . notNull ( T , STRING ) ; this . T = T ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; this . T = ( T ) BeanUtils . instantiateClass ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MessageSource org.springframework.boot.bind.MessageSource ) { this . org.springframework.boot.bind.MessageSource = org.springframework.boot.bind.MessageSource ; }  <METHOD_END>
<METHOD_START> public void void ( PropertySources org.springframework.boot.bind.PropertySources ) { this . org.springframework.boot.bind.PropertySources = org.springframework.boot.bind.PropertySources ; }  <METHOD_END>
<METHOD_START> public void void ( ConversionService org.springframework.boot.bind.ConversionService ) { this . org.springframework.boot.bind.ConversionService = org.springframework.boot.bind.ConversionService ; }  <METHOD_END>
<METHOD_START> public void void ( Validator org.springframework.boot.bind.Validator ) { this . org.springframework.boot.bind.Validator = org.springframework.boot.bind.Validator ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { if ( this . T == null ) { return java.lang.Object .class ; } return this . T . java.lang.Class<? extends java.lang.Object> ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public T T ( ) java.lang.Exception { if ( ! this . boolean ) { void ( ) ; } return this . T ; }  <METHOD_END>
<METHOD_START> public void void ( ) org.springframework.boot.bind.BindException { Assert . state ( this . org.springframework.boot.bind.PropertySources != null , STRING ) ; if ( org.springframework.boot.bind.Log . isTraceEnabled ( ) ) { org.springframework.boot.bind.Log . trace ( STRING + this . org.springframework.boot.bind.PropertySources ) ; } this . boolean = true ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) org.springframework.boot.bind.BindException { RelaxedDataBinder org.springframework.boot.bind.RelaxedDataBinder = ( this . java.lang.String != null ? new RelaxedDataBinder ( this . T , this . java.lang.String ) : new RelaxedDataBinder ( this . T ) ) ; if ( this . org.springframework.boot.bind.Validator != null && this . org.springframework.boot.bind.Validator . supports ( org.springframework.boot.bind.RelaxedDataBinder . getTarget ( ) . getClass ( ) ) ) { org.springframework.boot.bind.RelaxedDataBinder . setValidator ( this . org.springframework.boot.bind.Validator ) ; } if ( this . org.springframework.boot.bind.ConversionService != null ) { org.springframework.boot.bind.RelaxedDataBinder . setConversionService ( this . org.springframework.boot.bind.ConversionService ) ; } org.springframework.boot.bind.RelaxedDataBinder . setAutoGrowCollectionLimit ( java.lang.Integer . int ) ; org.springframework.boot.bind.RelaxedDataBinder . setIgnoreNestedProperties ( this . boolean ) ; org.springframework.boot.bind.RelaxedDataBinder . setIgnoreInvalidFields ( this . boolean ) ; org.springframework.boot.bind.RelaxedDataBinder . setIgnoreUnknownFields ( this . boolean ) ; void ( org.springframework.boot.bind.RelaxedDataBinder ) ; java.lang.Iterable<java.lang.String> < java.lang.String > java.lang.Iterable<java.lang.String> = java.lang.Iterable<java.lang.String> ( ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = java.util.Set<java.lang.String> ( java.lang.Iterable<java.lang.String> ) ; PropertyValues org.springframework.boot.bind.PropertyValues = org.springframework.boot.bind.PropertyValues ( java.util.Set<java.lang.String> , java.lang.Iterable<java.lang.String> ) ; org.springframework.boot.bind.RelaxedDataBinder . bind ( org.springframework.boot.bind.PropertyValues ) ; if ( this . org.springframework.boot.bind.Validator != null ) { org.springframework.boot.bind.RelaxedDataBinder . validate ( ) ; } void ( org.springframework.boot.bind.RelaxedDataBinder ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Iterable<java.lang.String> < java.lang.String > java.lang.Iterable<java.lang.String> ( ) { return ( this . T != null && StringUtils . hasLength ( this . java.lang.String ) ? new RelaxedNames ( this . java.lang.String ) : null ) ; }  <METHOD_END>
<METHOD_START> private java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( java.lang.Iterable<java.lang.String> < java.lang.String > java.lang.Iterable<java.lang.String> ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.LinkedHashSet<java.lang.String> <> ( ) ; if ( this . T != null ) { java.beans.PropertyDescriptor [] java.beans.PropertyDescriptor[] = BeanUtils . getPropertyDescriptors ( this . T . java.lang.Class<? extends java.lang.Object> ( ) ) ; for ( java.beans.PropertyDescriptor java.beans.PropertyDescriptor : java.beans.PropertyDescriptor[] ) { java.lang.String java.lang.String = java.beans.PropertyDescriptor . java.lang.String ( ) ; if ( ! java.lang.String . boolean ( STRING ) ) { RelaxedNames org.springframework.boot.bind.RelaxedNames = RelaxedNames . forCamelCase ( java.lang.String ) ; if ( java.lang.Iterable<java.lang.String> == null ) { for ( java.lang.String java.lang.String : org.springframework.boot.bind.RelaxedNames ) { java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; } } else { for ( java.lang.String java.lang.String : java.lang.Iterable<java.lang.String> ) { for ( java.lang.String java.lang.String : org.springframework.boot.bind.RelaxedNames ) { java.util.Set<java.lang.String> . boolean ( java.lang.String + STRING + java.lang.String ) ; java.util.Set<java.lang.String> . boolean ( java.lang.String + STRING + java.lang.String ) ; } } } } } } return java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.bind.PropertyValues org.springframework.boot.bind.PropertyValues ( java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> , java.lang.Iterable<java.lang.String> < java.lang.String > java.lang.Iterable<java.lang.String> ) { PropertyNamePatternsMatcher org.springframework.boot.bind.PropertyNamePatternsMatcher = org.springframework.boot.bind.PropertyNamePatternsMatcher ( java.util.Set<java.lang.String> , java.lang.Iterable<java.lang.String> ) ; return new PropertySourcesPropertyValues ( this . org.springframework.boot.bind.PropertySources , java.util.Set<java.lang.String> , org.springframework.boot.bind.PropertyNamePatternsMatcher , this . boolean ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.bind.PropertyNamePatternsMatcher org.springframework.boot.bind.PropertyNamePatternsMatcher ( java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> , java.lang.Iterable<java.lang.String> < java.lang.String > java.lang.Iterable<java.lang.String> ) { if ( this . boolean && ! boolean ( ) ) { return new DefaultPropertyNamePatternsMatcher ( char[] , true , java.util.Set<java.lang.String> ) ; } if ( java.lang.Iterable<java.lang.String> != null ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> <> ( ) ; for ( java.lang.String java.lang.String : java.lang.Iterable<java.lang.String> ) { java.util.Set<java.lang.String> . boolean ( java.lang.String ) ; } return new DefaultPropertyNamePatternsMatcher ( char[] , true , java.util.Set<java.lang.String> ) ; } return PropertyNamePatternsMatcher . ALL ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { return this . T != null && java.util.Map .class . boolean ( this . T . java.lang.Class<? extends java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( RelaxedDataBinder org.springframework.boot.bind.RelaxedDataBinder )			throws org.springframework.boot.bind.BindException { BindingResult org.springframework.boot.bind.BindingResult = org.springframework.boot.bind.RelaxedDataBinder . getBindingResult ( ) ; if ( org.springframework.boot.bind.BindingResult . hasErrors ( ) ) { org.springframework.boot.bind.Log . error ( STRING ) ; for ( ObjectError org.springframework.boot.bind.ObjectError : org.springframework.boot.bind.BindingResult . getAllErrors ( ) ) { org.springframework.boot.bind.Log . error ( this . org.springframework.boot.bind.MessageSource != null ? this . org.springframework.boot.bind.MessageSource . getMessage ( org.springframework.boot.bind.ObjectError , java.util.Locale . java.util.Locale ( ) ) + STRING + org.springframework.boot.bind.ObjectError + STRING : org.springframework.boot.bind.ObjectError ) ; } throw new BindException ( org.springframework.boot.bind.BindingResult ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( DataBinder org.springframework.boot.bind.DataBinder ) {	}  <METHOD_END>
