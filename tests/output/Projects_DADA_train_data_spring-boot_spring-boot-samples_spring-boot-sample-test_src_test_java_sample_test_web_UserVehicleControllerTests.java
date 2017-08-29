<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . sample.test.web.UserVehicleService . getVehicleDetails ( STRING ) ) . willReturn ( new VehicleDetails ( STRING , STRING ) ) ; this . sample.test.web.MockMvc . perform ( get ( STRING ) . accept ( MediaType . TEXT_PLAIN ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . sample.test.web.UserVehicleService . getVehicleDetails ( STRING ) ) . willReturn ( new VehicleDetails ( STRING , STRING ) ) ; this . sample.test.web.MockMvc . perform ( get ( STRING ) . accept ( MediaType . APPLICATION_JSON ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . json ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . sample.test.web.UserVehicleService . getVehicleDetails ( STRING ) ) . willReturn ( new VehicleDetails ( STRING , STRING ) ) ; this . sample.test.web.MockMvc . perform ( get ( STRING ) . accept ( MediaType . TEXT_HTML ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( containsString ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . sample.test.web.UserVehicleService . getVehicleDetails ( STRING ) ) . willThrow ( new UserNameNotFoundException ( STRING ) ) ; this . sample.test.web.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isNotFound ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . sample.test.web.UserVehicleService . getVehicleDetails ( STRING ) ) . willThrow ( new VehicleIdentificationNumberNotFoundException ( sample.test.web.VehicleIdentificationNumber ) ) ; this . sample.test.web.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isNotFound ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = NoSuchBeanDefinitionException .class ) public void void ( ) java.lang.Exception { assertThat ( this . sample.test.web.ApplicationContext . getBean ( WelcomeCommandLineRunner .class ) ) ; }  <METHOD_END>
