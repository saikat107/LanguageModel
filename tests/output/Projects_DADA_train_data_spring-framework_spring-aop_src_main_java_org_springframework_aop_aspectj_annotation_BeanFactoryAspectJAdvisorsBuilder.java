<METHOD_START> public void ( ListableBeanFactory org.springframework.aop.aspectj.annotation.ListableBeanFactory ) { this( org.springframework.aop.aspectj.annotation.ListableBeanFactory , new ReflectiveAspectJAdvisorFactory ( org.springframework.aop.aspectj.annotation.ListableBeanFactory ) ); }  <METHOD_END>
<METHOD_START> public void ( ListableBeanFactory org.springframework.aop.aspectj.annotation.ListableBeanFactory , AspectJAdvisorFactory org.springframework.aop.aspectj.annotation.AspectJAdvisorFactory ) { Assert . notNull ( org.springframework.aop.aspectj.annotation.ListableBeanFactory , STRING ) ; Assert . notNull ( org.springframework.aop.aspectj.annotation.AspectJAdvisorFactory , STRING ) ; this . org.springframework.aop.aspectj.annotation.ListableBeanFactory = org.springframework.aop.aspectj.annotation.ListableBeanFactory ; this . org.springframework.aop.aspectj.annotation.AspectJAdvisorFactory = org.springframework.aop.aspectj.annotation.AspectJAdvisorFactory ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.aop.aspectj.annotation.Advisor> < Advisor > java.util.List<org.springframework.aop.aspectj.annotation.Advisor> ( ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = this . java.util.List<java.lang.String> ; if ( java.util.List<java.lang.String> == null ) { synchronized ( this ) { java.util.List<java.lang.String> = this . java.util.List<java.lang.String> ; if ( java.util.List<java.lang.String> == null ) { java.util.List<org.springframework.aop.aspectj.annotation.Advisor> < Advisor > java.util.List<org.springframework.aop.aspectj.annotation.Advisor> = new java.util.LinkedList<org.springframework.aop.aspectj.annotation.Advisor> <> ( ) ; java.util.List<java.lang.String> = new java.util.LinkedList<java.lang.String> <> ( ) ; java.lang.String [] java.lang.String[] = BeanFactoryUtils . beanNamesForTypeIncludingAncestors ( this . org.springframework.aop.aspectj.annotation.ListableBeanFactory , java.lang.Object .class , true , false ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { if ( ! boolean ( java.lang.String ) ) { continue; } java.lang.Class<?> < ? > java.lang.Class<?> = this . org.springframework.aop.aspectj.annotation.ListableBeanFactory . getType ( java.lang.String ) ; if ( java.lang.Class<> == null ) { continue; } if ( this . org.springframework.aop.aspectj.annotation.AspectJAdvisorFactory . isAspect ( java.lang.Class<> ) ) { java.util.List<java.lang.String> . boolean ( java.lang.String ) ; AspectMetadata org.springframework.aop.aspectj.annotation.AspectMetadata = new AspectMetadata ( java.lang.Class<> , java.lang.String ) ; if ( org.springframework.aop.aspectj.annotation.AspectMetadata . getAjType ( ) . getPerClause ( ) . getKind ( ) == PerClauseKind . SINGLETON ) { MetadataAwareAspectInstanceFactory org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory = new BeanFactoryAspectInstanceFactory ( this . org.springframework.aop.aspectj.annotation.ListableBeanFactory , java.lang.String ) ; java.util.List<org.springframework.aop.aspectj.annotation.Advisor> < Advisor > java.util.List<org.springframework.aop.aspectj.annotation.Advisor> = this . org.springframework.aop.aspectj.annotation.AspectJAdvisorFactory . getAdvisors ( org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory ) ; if ( this . org.springframework.aop.aspectj.annotation.ListableBeanFactory . isSingleton ( java.lang.String ) ) { this . java.util.Map<java.lang.String,java.util.List<org.springframework.aop.aspectj.annotation.Advisor>> . put ( java.lang.String , java.util.List<org.springframework.aop.aspectj.annotation.Advisor> ) ; } else { this . java.util.Map<java.lang.String,org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory> . put ( java.lang.String , org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory ) ; } java.util.List<org.springframework.aop.aspectj.annotation.Advisor> . addAll ( java.util.List<org.springframework.aop.aspectj.annotation.Advisor> ) ; } else { if ( this . org.springframework.aop.aspectj.annotation.ListableBeanFactory . isSingleton ( java.lang.String ) ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING ) ; } MetadataAwareAspectInstanceFactory org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory = new PrototypeAspectInstanceFactory ( this . org.springframework.aop.aspectj.annotation.ListableBeanFactory , java.lang.String ) ; this . java.util.Map<java.lang.String,org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory> . put ( java.lang.String , org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory ) ; java.util.List<org.springframework.aop.aspectj.annotation.Advisor> . addAll ( this . org.springframework.aop.aspectj.annotation.AspectJAdvisorFactory . getAdvisors ( org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory ) ) ; } } } this . java.util.List<java.lang.String> = java.util.List<java.lang.String> ; return java.util.List<org.springframework.aop.aspectj.annotation.Advisor> ; } } } if ( java.util.List<java.lang.String> . boolean ( ) ) { return java.util.Collections . java.util.List<org.springframework.aop.aspectj.annotation.Advisor> ( ) ; } java.util.List<org.springframework.aop.aspectj.annotation.Advisor> < Advisor > java.util.List<org.springframework.aop.aspectj.annotation.Advisor> = new java.util.LinkedList<org.springframework.aop.aspectj.annotation.Advisor> <> ( ) ; for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { java.util.List<org.springframework.aop.aspectj.annotation.Advisor> < Advisor > java.util.List<org.springframework.aop.aspectj.annotation.Advisor> = this . java.util.Map<java.lang.String,java.util.List<org.springframework.aop.aspectj.annotation.Advisor>> . get ( java.lang.String ) ; if ( java.util.List<org.springframework.aop.aspectj.annotation.Advisor> != null ) { java.util.List<org.springframework.aop.aspectj.annotation.Advisor> . addAll ( java.util.List<org.springframework.aop.aspectj.annotation.Advisor> ) ; } else { MetadataAwareAspectInstanceFactory org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory = this . java.util.Map<java.lang.String,org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory> . get ( java.lang.String ) ; java.util.List<org.springframework.aop.aspectj.annotation.Advisor> . addAll ( this . org.springframework.aop.aspectj.annotation.AspectJAdvisorFactory . getAdvisors ( org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory ) ) ; } } return java.util.List<org.springframework.aop.aspectj.annotation.Advisor> ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.String java.lang.String ) { return true ; }  <METHOD_END>
