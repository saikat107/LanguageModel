<METHOD_START> @ Test public void void ( ) { AbstractApplicationContext org.springframework.scheduling.quartz.AbstractApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.scheduling.quartz.QuartzSchedulerLifecycleTests> ( ) ) ; assertNotNull ( org.springframework.scheduling.quartz.AbstractApplicationContext . getBean ( STRING ) ) ; StopWatch org.springframework.scheduling.quartz.StopWatch = new StopWatch ( ) ; org.springframework.scheduling.quartz.StopWatch . start ( STRING ) ; org.springframework.scheduling.quartz.AbstractApplicationContext . destroy ( ) ; org.springframework.scheduling.quartz.StopWatch . stop ( ) ; assertTrue ( STRING + org.springframework.scheduling.quartz.StopWatch . getTotalTimeMillis ( ) , org.springframework.scheduling.quartz.StopWatch . getTotalTimeMillis ( ) < NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AbstractApplicationContext org.springframework.scheduling.quartz.AbstractApplicationContext = new ClassPathXmlApplicationContext ( STRING , this . java.lang.Class<? extends org.springframework.scheduling.quartz.QuartzSchedulerLifecycleTests> ( ) ) ; assertNotNull ( org.springframework.scheduling.quartz.AbstractApplicationContext . getBean ( STRING ) ) ; StopWatch org.springframework.scheduling.quartz.StopWatch = new StopWatch ( ) ; org.springframework.scheduling.quartz.StopWatch . start ( STRING ) ; org.springframework.scheduling.quartz.AbstractApplicationContext . destroy ( ) ; org.springframework.scheduling.quartz.StopWatch . stop ( ) ; assertTrue ( STRING + org.springframework.scheduling.quartz.StopWatch . getTotalTimeMillis ( ) , org.springframework.scheduling.quartz.StopWatch . getTotalTimeMillis ( ) < NUMBER ) ; }  <METHOD_END>
