<METHOD_START> public void void ( Validator org.springframework.validation.beanvalidation.Validator ) { this . org.springframework.validation.beanvalidation.Validator = org.springframework.validation.beanvalidation.Validator ; }  <METHOD_END>
<METHOD_START> public void void ( ValidatorFactory org.springframework.validation.beanvalidation.ValidatorFactory ) { this . org.springframework.validation.beanvalidation.Validator = org.springframework.validation.beanvalidation.ValidatorFactory . getValidator ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.validation.beanvalidation.Validator == null ) { this . org.springframework.validation.beanvalidation.Validator = Validation . buildDefaultValidatorFactory ( ) . getValidator ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.validation.beanvalidation.BeansException { if ( ! this . boolean ) { void ( java.lang.Object ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.validation.beanvalidation.BeansException { if ( this . boolean ) { void ( java.lang.Object ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.Object java.lang.Object ) { java.util.Set<org.springframework.validation.beanvalidation.ConstraintViolation<java.lang.Object>> < ConstraintViolation < java.lang.Object > > java.util.Set<org.springframework.validation.beanvalidation.ConstraintViolation<java.lang.Object>> = this . org.springframework.validation.beanvalidation.Validator . validate ( java.lang.Object ) ; if ( ! java.util.Set<org.springframework.validation.beanvalidation.ConstraintViolation<java.lang.Object>> . isEmpty ( ) ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( STRING ) ; for ( java.util.Iterator<org.springframework.validation.beanvalidation.ConstraintViolation<java.lang.Object>> < ConstraintViolation < java.lang.Object > > java.util.Iterator<org.springframework.validation.beanvalidation.ConstraintViolation<java.lang.Object>> = java.util.Set<org.springframework.validation.beanvalidation.ConstraintViolation<java.lang.Object>> . iterator ( ) ; java.util.Iterator<org.springframework.validation.beanvalidation.ConstraintViolation<java.lang.Object>> . hasNext ( ) ;) { ConstraintViolation < java.lang.Object > org.springframework.validation.beanvalidation.ConstraintViolation<java.lang.Object> = java.util.Iterator<org.springframework.validation.beanvalidation.ConstraintViolation<java.lang.Object>> . next ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( org.springframework.validation.beanvalidation.ConstraintViolation<java.lang.Object> . getPropertyPath ( ) ) . append ( STRING ) . append ( org.springframework.validation.beanvalidation.ConstraintViolation<java.lang.Object> . getMessage ( ) ) ; if ( java.util.Iterator<org.springframework.validation.beanvalidation.ConstraintViolation<java.lang.Object>> . hasNext ( ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } } throw new BeanInitializationException ( java.lang.StringBuilder . java.lang.String ( ) ) ; } }  <METHOD_END>