<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( SchedulerContext org.springframework.scheduling.quartz.SchedulerContext ) { this . org.springframework.scheduling.quartz.SchedulerContext = org.springframework.scheduling.quartz.SchedulerContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( TriggerFiredBundle org.springframework.scheduling.quartz.TriggerFiredBundle ) throws java.lang.Exception { java.lang.Object java.lang.Object = super. createJobInstance ( org.springframework.scheduling.quartz.TriggerFiredBundle ) ; if ( boolean ( java.lang.Object ) ) { BeanWrapper org.springframework.scheduling.quartz.BeanWrapper = PropertyAccessorFactory . forBeanPropertyAccess ( java.lang.Object ) ; MutablePropertyValues org.springframework.scheduling.quartz.MutablePropertyValues = new MutablePropertyValues ( ) ; if ( this . org.springframework.scheduling.quartz.SchedulerContext != null ) { org.springframework.scheduling.quartz.MutablePropertyValues . addPropertyValues ( this . org.springframework.scheduling.quartz.SchedulerContext ) ; } org.springframework.scheduling.quartz.MutablePropertyValues . addPropertyValues ( org.springframework.scheduling.quartz.TriggerFiredBundle . getJobDetail ( ) . getJobDataMap ( ) ) ; org.springframework.scheduling.quartz.MutablePropertyValues . addPropertyValues ( org.springframework.scheduling.quartz.TriggerFiredBundle . getTrigger ( ) . getJobDataMap ( ) ) ; if ( this . java.lang.String[] != null ) { for ( java.lang.String java.lang.String : this . java.lang.String[] ) { if ( org.springframework.scheduling.quartz.MutablePropertyValues . contains ( java.lang.String ) && ! org.springframework.scheduling.quartz.BeanWrapper . isWritableProperty ( java.lang.String ) ) { org.springframework.scheduling.quartz.MutablePropertyValues . removePropertyValue ( java.lang.String ) ; } } org.springframework.scheduling.quartz.BeanWrapper . setPropertyValues ( org.springframework.scheduling.quartz.MutablePropertyValues ) ; } else { org.springframework.scheduling.quartz.BeanWrapper . setPropertyValues ( org.springframework.scheduling.quartz.MutablePropertyValues , true ) ; } } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.Object java.lang.Object ) { return ( ! ( java.lang.Object instanceof QuartzJobBean ) ) ; }  <METHOD_END>