<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , AbstractBeanDefinition org.springframework.context.config.AbstractBeanDefinition , ParserContext org.springframework.context.config.ParserContext ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( ID_ATTRIBUTE ) ; return ( StringUtils . hasText ( java.lang.String ) ? java.lang.String : java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.context.config.AbstractBeanDefinition org.springframework.context.config.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.context.config.ParserContext ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { RootBeanDefinition org.springframework.context.config.RootBeanDefinition = new RootBeanDefinition ( MBeanServerFactoryBean .class ) ; org.springframework.context.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.String ) ; return org.springframework.context.config.RootBeanDefinition ; } AbstractBeanDefinition org.springframework.context.config.AbstractBeanDefinition = org.springframework.context.config.AbstractBeanDefinition ( ) ; if ( org.springframework.context.config.AbstractBeanDefinition != null ) { return org.springframework.context.config.AbstractBeanDefinition ; } RootBeanDefinition org.springframework.context.config.RootBeanDefinition = new RootBeanDefinition ( MBeanServerFactoryBean .class ) ; org.springframework.context.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.Boolean . java.lang.Boolean ) ; org.springframework.context.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.context.config.RootBeanDefinition . setSource ( org.springframework.context.config.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; return org.springframework.context.config.RootBeanDefinition ; }  <METHOD_END>
<METHOD_START> static org.springframework.context.config.AbstractBeanDefinition org.springframework.context.config.AbstractBeanDefinition ( ) { if ( boolean ) { RootBeanDefinition org.springframework.context.config.RootBeanDefinition = new RootBeanDefinition ( JndiObjectFactoryBean .class ) ; org.springframework.context.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , STRING ) ; return org.springframework.context.config.RootBeanDefinition ; } else if ( boolean ) { return new RootBeanDefinition ( WebSphereMBeanServerFactoryBean .class ) ; } else { return null ; } }  <METHOD_END>
