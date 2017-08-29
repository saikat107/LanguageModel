<METHOD_START> public void void ( BeanWiringInfoResolver org.springframework.beans.factory.wiring.BeanWiringInfoResolver ) { Assert . notNull ( org.springframework.beans.factory.wiring.BeanWiringInfoResolver , STRING ) ; this . org.springframework.beans.factory.wiring.BeanWiringInfoResolver = org.springframework.beans.factory.wiring.BeanWiringInfoResolver ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.beans.factory.wiring.BeanFactory ) { if ( ! ( org.springframework.beans.factory.wiring.BeanFactory instanceof ConfigurableListableBeanFactory ) ) { throw new java.lang.IllegalArgumentException ( STRING + org.springframework.beans.factory.wiring.BeanFactory ) ; } this . org.springframework.beans.factory.wiring.ConfigurableListableBeanFactory = ( ConfigurableListableBeanFactory ) org.springframework.beans.factory.wiring.BeanFactory ; if ( this . org.springframework.beans.factory.wiring.BeanWiringInfoResolver == null ) { this . org.springframework.beans.factory.wiring.BeanWiringInfoResolver = org.springframework.beans.factory.wiring.BeanWiringInfoResolver ( ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.beans.factory.wiring.BeanWiringInfoResolver org.springframework.beans.factory.wiring.BeanWiringInfoResolver ( ) { return new ClassNameBeanWiringInfoResolver ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { Assert . notNull ( this . org.springframework.beans.factory.wiring.ConfigurableListableBeanFactory , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.beans.factory.wiring.ConfigurableListableBeanFactory = null ; this . org.springframework.beans.factory.wiring.BeanWiringInfoResolver = null ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { if ( this . org.springframework.beans.factory.wiring.ConfigurableListableBeanFactory == null ) { if ( org.springframework.beans.factory.wiring.Log . isDebugEnabled ( ) ) { org.springframework.beans.factory.wiring.Log . debug ( STRING + ClassUtils . getShortName ( java.lang.Class<? extends org.springframework.beans.factory.wiring.BeanConfigurerSupport> ( ) ) + STRING + STRING + ClassUtils . getDescriptiveType ( java.lang.Object ) + STRING ) ; } return; } BeanWiringInfo org.springframework.beans.factory.wiring.BeanWiringInfo = this . org.springframework.beans.factory.wiring.BeanWiringInfoResolver . resolveWiringInfo ( java.lang.Object ) ; if ( org.springframework.beans.factory.wiring.BeanWiringInfo == null ) { return; } try { if ( org.springframework.beans.factory.wiring.BeanWiringInfo . indicatesAutowiring ( ) || ( org.springframework.beans.factory.wiring.BeanWiringInfo . isDefaultBeanName ( ) && ! this . org.springframework.beans.factory.wiring.ConfigurableListableBeanFactory . containsBean ( org.springframework.beans.factory.wiring.BeanWiringInfo . getBeanName ( ) ) ) ) { this . org.springframework.beans.factory.wiring.ConfigurableListableBeanFactory . autowireBeanProperties ( java.lang.Object , org.springframework.beans.factory.wiring.BeanWiringInfo . getAutowireMode ( ) , org.springframework.beans.factory.wiring.BeanWiringInfo . getDependencyCheck ( ) ) ; java.lang.Object java.lang.Object = this . org.springframework.beans.factory.wiring.ConfigurableListableBeanFactory . initializeBean ( java.lang.Object , org.springframework.beans.factory.wiring.BeanWiringInfo . getBeanName ( ) ) ; void ( java.lang.Object , java.lang.Object ) ; } else { java.lang.Object java.lang.Object = this . org.springframework.beans.factory.wiring.ConfigurableListableBeanFactory . configureBean ( java.lang.Object , org.springframework.beans.factory.wiring.BeanWiringInfo . getBeanName ( ) ) ; void ( java.lang.Object , java.lang.Object ) ; } } catch ( BeanCreationException org.springframework.beans.factory.wiring.BeanCreationException ) { java.lang.Throwable java.lang.Throwable = org.springframework.beans.factory.wiring.BeanCreationException . getMostSpecificCause ( ) ; if ( java.lang.Throwable instanceof BeanCurrentlyInCreationException ) { BeanCreationException org.springframework.beans.factory.wiring.BeanCreationException = ( BeanCreationException ) java.lang.Throwable ; if ( this . org.springframework.beans.factory.wiring.ConfigurableListableBeanFactory . isCurrentlyInCreation ( org.springframework.beans.factory.wiring.BeanCreationException . getBeanName ( ) ) ) { if ( org.springframework.beans.factory.wiring.Log . isDebugEnabled ( ) ) { org.springframework.beans.factory.wiring.Log . debug ( STRING + org.springframework.beans.factory.wiring.BeanCreationException . getBeanName ( ) + STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) + STRING + STRING + org.springframework.beans.factory.wiring.BeanCreationException ) ; } return; } } throw org.springframework.beans.factory.wiring.BeanCreationException ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) { if ( java.lang.Object != java.lang.Object ) { throw new java.lang.IllegalStateException ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) + STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) + STRING ) ; } }  <METHOD_END>
