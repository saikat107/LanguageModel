<METHOD_START> @ java.lang.Override public void void ( AnnotationMetadata org.springframework.context.annotation.AnnotationMetadata , BeanDefinitionRegistry org.springframework.context.annotation.BeanDefinitionRegistry ) { AopConfigUtils . registerAspectJAnnotationAutoProxyCreatorIfNecessary ( org.springframework.context.annotation.BeanDefinitionRegistry ) ; AnnotationAttributes org.springframework.context.annotation.AnnotationAttributes = AnnotationConfigUtils . attributesFor ( org.springframework.context.annotation.AnnotationMetadata , EnableAspectJAutoProxy .class ) ; if ( org.springframework.context.annotation.AnnotationAttributes . getBoolean ( STRING ) ) { AopConfigUtils . forceAutoProxyCreatorToUseClassProxying ( org.springframework.context.annotation.BeanDefinitionRegistry ) ; } if ( org.springframework.context.annotation.AnnotationAttributes . getBoolean ( STRING ) ) { AopConfigUtils . forceAutoProxyCreatorToExposeProxy ( org.springframework.context.annotation.BeanDefinitionRegistry ) ; } }  <METHOD_END>
