<METHOD_START> public void ( ConfigurableBeanFactory org.springframework.beans.factory.config.ConfigurableBeanFactory , Scope org.springframework.beans.factory.config.Scope ) { Assert . notNull ( org.springframework.beans.factory.config.ConfigurableBeanFactory , STRING ) ; this . org.springframework.beans.factory.config.ConfigurableBeanFactory = org.springframework.beans.factory.config.ConfigurableBeanFactory ; this . org.springframework.beans.factory.config.Scope = org.springframework.beans.factory.config.Scope ; }  <METHOD_END>
<METHOD_START> public final org.springframework.beans.factory.config.ConfigurableBeanFactory org.springframework.beans.factory.config.ConfigurableBeanFactory ( ) { return this . org.springframework.beans.factory.config.ConfigurableBeanFactory ; }  <METHOD_END>
<METHOD_START> public final org.springframework.beans.factory.config.Scope org.springframework.beans.factory.config.Scope ( ) { return this . org.springframework.beans.factory.config.Scope ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( java.lang.String java.lang.String ) { return ( this . org.springframework.beans.factory.config.ConfigurableBeanFactory . containsBean ( java.lang.String ) || ( this . org.springframework.beans.factory.config.Scope != null && this . org.springframework.beans.factory.config.Scope . resolveContextualObject ( java.lang.String ) != null ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { if ( this . org.springframework.beans.factory.config.ConfigurableBeanFactory . containsBean ( java.lang.String ) ) { return this . org.springframework.beans.factory.config.ConfigurableBeanFactory . getBean ( java.lang.String ) ; } else if ( this . org.springframework.beans.factory.config.Scope != null ) { return this . org.springframework.beans.factory.config.Scope . resolveContextualObject ( java.lang.String ) ; } else { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.beans.factory.config.BeanExpressionContext ) ) { return false ; } org.springframework.beans.factory.config.BeanExpressionContext org.springframework.beans.factory.config.BeanExpressionContext = ( org.springframework.beans.factory.config.BeanExpressionContext ) java.lang.Object ; return ( this . org.springframework.beans.factory.config.ConfigurableBeanFactory == org.springframework.beans.factory.config.BeanExpressionContext . org.springframework.beans.factory.config.ConfigurableBeanFactory && this . org.springframework.beans.factory.config.Scope == org.springframework.beans.factory.config.BeanExpressionContext . org.springframework.beans.factory.config.Scope ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . org.springframework.beans.factory.config.ConfigurableBeanFactory . hashCode ( ) ; }  <METHOD_END>