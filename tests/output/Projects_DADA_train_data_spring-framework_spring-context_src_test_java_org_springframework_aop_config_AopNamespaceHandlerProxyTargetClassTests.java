<METHOD_START> @ Test public void void ( ) { ITestBean org.springframework.aop.config.ITestBean = getTestBean ( ) ; assertTrue ( STRING , AopUtils . isCglibProxy ( org.springframework.aop.config.ITestBean ) ) ; assertTrue ( STRING , ( ( Advised ) org.springframework.aop.config.ITestBean ) . isExposeProxy ( ) ) ; }  <METHOD_END>
