<METHOD_START> @ Test public void void ( ) { Region < ? , ? > org.springframework.data.gemfire.config.xml.Region<?,?> = org.springframework.data.gemfire.config.xml.ApplicationContext . getBean ( STRING , Region .class ) ; MembershipAttributes org.springframework.data.gemfire.config.xml.MembershipAttributes = org.springframework.data.gemfire.config.xml.Region<,> . getAttributes ( ) . getMembershipAttributes ( ) ; assertFalse ( org.springframework.data.gemfire.config.xml.MembershipAttributes . hasRequiredRoles ( ) ) ; Region < ? , ? > org.springframework.data.gemfire.config.xml.Region<?,?> = org.springframework.data.gemfire.config.xml.ApplicationContext . getBean ( STRING , Region .class ) ; org.springframework.data.gemfire.config.xml.MembershipAttributes = org.springframework.data.gemfire.config.xml.Region<,> . getAttributes ( ) . getMembershipAttributes ( ) ; assertTrue ( org.springframework.data.gemfire.config.xml.MembershipAttributes . hasRequiredRoles ( ) ) ; assertEquals ( ResumptionAction . REINITIALIZE , org.springframework.data.gemfire.config.xml.MembershipAttributes . getResumptionAction ( ) ) ; assertEquals ( LossAction . LIMITED_ACCESS , org.springframework.data.gemfire.config.xml.MembershipAttributes . getLossAction ( ) ) ; for ( Role org.springframework.data.gemfire.config.xml.Role : org.springframework.data.gemfire.config.xml.MembershipAttributes . getRequiredRoles ( ) ) { assertTrue ( STRING . boolean ( org.springframework.data.gemfire.config.xml.Role . getName ( ) ) || STRING . boolean ( org.springframework.data.gemfire.config.xml.Role . getName ( ) ) ) ; } }  <METHOD_END>
