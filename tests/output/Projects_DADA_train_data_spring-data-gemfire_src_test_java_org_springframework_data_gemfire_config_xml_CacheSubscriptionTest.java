<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( org.springframework.data.gemfire.config.xml.ApplicationContext . containsBean ( STRING ) ) ; RegionFactoryBean org.springframework.data.gemfire.config.xml.RegionFactoryBean = org.springframework.data.gemfire.config.xml.ApplicationContext . getBean ( STRING , RegionFactoryBean .class ) ; RegionAttributes org.springframework.data.gemfire.config.xml.RegionAttributes = TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.RegionFactoryBean ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.RegionAttributes ) ; SubscriptionAttributes org.springframework.data.gemfire.config.xml.SubscriptionAttributes = org.springframework.data.gemfire.config.xml.RegionAttributes . getSubscriptionAttributes ( ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.SubscriptionAttributes ) ; assertEquals ( InterestPolicy . ALL , org.springframework.data.gemfire.config.xml.SubscriptionAttributes . getInterestPolicy ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( org.springframework.data.gemfire.config.xml.ApplicationContext . containsBean ( STRING ) ) ; RegionFactoryBean org.springframework.data.gemfire.config.xml.RegionFactoryBean = org.springframework.data.gemfire.config.xml.ApplicationContext . getBean ( STRING , RegionFactoryBean .class ) ; RegionAttributes org.springframework.data.gemfire.config.xml.RegionAttributes = TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.RegionFactoryBean ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.RegionAttributes ) ; SubscriptionAttributes org.springframework.data.gemfire.config.xml.SubscriptionAttributes = org.springframework.data.gemfire.config.xml.RegionAttributes . getSubscriptionAttributes ( ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.SubscriptionAttributes ) ; assertEquals ( InterestPolicy . CACHE_CONTENT , org.springframework.data.gemfire.config.xml.SubscriptionAttributes . getInterestPolicy ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( org.springframework.data.gemfire.config.xml.ApplicationContext . containsBean ( STRING ) ) ; RegionFactoryBean org.springframework.data.gemfire.config.xml.RegionFactoryBean = org.springframework.data.gemfire.config.xml.ApplicationContext . getBean ( STRING , RegionFactoryBean .class ) ; RegionAttributes org.springframework.data.gemfire.config.xml.RegionAttributes = TestUtils . readField ( STRING , org.springframework.data.gemfire.config.xml.RegionFactoryBean ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.RegionAttributes ) ; SubscriptionAttributes org.springframework.data.gemfire.config.xml.SubscriptionAttributes = org.springframework.data.gemfire.config.xml.RegionAttributes . getSubscriptionAttributes ( ) ; assertNotNull ( org.springframework.data.gemfire.config.xml.SubscriptionAttributes ) ; assertEquals ( InterestPolicy . DEFAULT , org.springframework.data.gemfire.config.xml.SubscriptionAttributes . getInterestPolicy ( ) ) ; }  <METHOD_END>
