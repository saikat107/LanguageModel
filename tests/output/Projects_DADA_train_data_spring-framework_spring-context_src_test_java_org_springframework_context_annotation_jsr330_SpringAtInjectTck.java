<METHOD_START> public static org.springframework.context.annotation.jsr330.Test org.springframework.context.annotation.jsr330.Test ( ) { GenericApplicationContext org.springframework.context.annotation.jsr330.GenericApplicationContext = new GenericApplicationContext ( ) ; AnnotatedBeanDefinitionReader org.springframework.context.annotation.jsr330.AnnotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader ( org.springframework.context.annotation.jsr330.GenericApplicationContext ) ; org.springframework.context.annotation.jsr330.AnnotatedBeanDefinitionReader . setScopeMetadataResolver ( new Jsr330ScopeMetadataResolver ( ) ) ; org.springframework.context.annotation.jsr330.AnnotatedBeanDefinitionReader . registerBean ( Convertible .class ) ; org.springframework.context.annotation.jsr330.AnnotatedBeanDefinitionReader . registerBean ( DriversSeat .class , Drivers .class ) ; org.springframework.context.annotation.jsr330.AnnotatedBeanDefinitionReader . registerBean ( Seat .class , Primary .class ) ; org.springframework.context.annotation.jsr330.AnnotatedBeanDefinitionReader . registerBean ( V8Engine .class ) ; org.springframework.context.annotation.jsr330.AnnotatedBeanDefinitionReader . registerBean ( SpareTire .class , STRING ) ; org.springframework.context.annotation.jsr330.AnnotatedBeanDefinitionReader . registerBean ( Cupholder .class ) ; org.springframework.context.annotation.jsr330.AnnotatedBeanDefinitionReader . registerBean ( Tire .class , Primary .class ) ; org.springframework.context.annotation.jsr330.AnnotatedBeanDefinitionReader . registerBean ( FuelTank .class ) ; org.springframework.context.annotation.jsr330.GenericApplicationContext . refresh ( ) ; Car org.springframework.context.annotation.jsr330.Car = org.springframework.context.annotation.jsr330.GenericApplicationContext . getBean ( Car .class ) ; return Tck . testsFor ( org.springframework.context.annotation.jsr330.Car , false , true ) ; }  <METHOD_END>
