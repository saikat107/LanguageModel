<METHOD_START> public void void ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect ) { this . org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect = org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) java.lang.Exception { ClassPathXmlApplicationContext org.springframework.aop.aspectj.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( java.lang.Class<? extends org.springframework.aop.aspectj.AfterReturningAdviceBindingTests> ( ) . java.lang.String ( ) + STRING , java.lang.Class<? extends org.springframework.aop.aspectj.AfterReturningAdviceBindingTests> ( ) ) ; org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect = ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect ) org.springframework.aop.aspectj.ClassPathXmlApplicationContext . getBean ( STRING ) ; org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator = mock ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator .class ) ; org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect . setCollaborator ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) ; org.springframework.aop.aspectj.ITestBean = ( ITestBean ) org.springframework.aop.aspectj.ClassPathXmlApplicationContext . getBean ( STRING ) ; assertTrue ( AopUtils . isAopProxy ( org.springframework.aop.aspectj.ITestBean ) ) ; this . org.springframework.aop.aspectj.TestBean = ( TestBean ) ( ( Advised ) org.springframework.aop.aspectj.ITestBean ) . getTargetSource ( ) . getTarget ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.aop.aspectj.ITestBean . setAge ( NUMBER ) ; verify ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) . oneIntArg ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.aop.aspectj.ITestBean . getAge ( ) ; verify ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) . oneObjectArg ( this . org.springframework.aop.aspectj.ITestBean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.aop.aspectj.ITestBean . setAge ( NUMBER ) ; verify ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) . oneIntAndOneObject ( NUMBER , this . org.springframework.aop.aspectj.ITestBean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.aop.aspectj.ITestBean . getAge ( ) ; verify ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) . needsJoinPoint ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.aop.aspectj.ITestBean . getAge ( ) ; verify ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) . needsJoinPointStaticPart ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.aop.aspectj.ITestBean . setName ( STRING ) ; org.springframework.aop.aspectj.ITestBean . getName ( ) ; verify ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) . oneString ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.aop.aspectj.ITestBean . returnsThis ( ) ; verify ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) . oneObjectArg ( this . org.springframework.aop.aspectj.TestBean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.aop.aspectj.ITestBean . returnsThis ( ) ; verify ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) . oneTestBeanArg ( this . org.springframework.aop.aspectj.TestBean ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.aop.aspectj.TestBean . setSpouse ( new TestBean ( ) ) ; ITestBean [] org.springframework.aop.aspectj.ITestBean[] = this . org.springframework.aop.aspectj.TestBean . getSpouses ( ) ; org.springframework.aop.aspectj.ITestBean . getSpouses ( ) ; verify ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) . testBeanArrayArg ( org.springframework.aop.aspectj.ITestBean[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.aop.aspectj.ITestBean . setSpouse ( this . org.springframework.aop.aspectj.ITestBean ) ; org.springframework.aop.aspectj.ITestBean . getSpouse ( ) ; verifyZeroInteractions ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.aop.aspectj.ITestBean . returnsThis ( ) ; verify ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) . objectMatchNoArgs ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.aop.aspectj.ITestBean . setAge ( NUMBER ) ; org.springframework.aop.aspectj.ITestBean . haveBirthday ( ) ; verify ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) . oneInt ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ( ) { return ( org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ) this . collaborator ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ( ) . void ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( TestBean org.springframework.aop.aspectj.TestBean ) { org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ( ) . void ( org.springframework.aop.aspectj.TestBean ) ; }  <METHOD_END>
<METHOD_START> public void void ( ITestBean [] org.springframework.aop.aspectj.ITestBean[] ) { org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ( ) . void ( org.springframework.aop.aspectj.ITestBean[] ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ( ) . void ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ( ) . void ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { org.springframework.aop.aspectj.AfterReturningAdviceBindingTestAspect.AfterReturningAdviceBindingCollaborator ( ) . void ( int ) ; }  <METHOD_END>
<METHOD_START> void void ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> void void ( TestBean org.springframework.aop.aspectj.TestBean );  <METHOD_END>
<METHOD_START> void void ( ITestBean [] org.springframework.aop.aspectj.ITestBean[] );  <METHOD_END>
<METHOD_START> void void ( )  <METHOD_END>
<METHOD_START> void void ( )  <METHOD_END>
<METHOD_START> void void ( int int );  <METHOD_END>