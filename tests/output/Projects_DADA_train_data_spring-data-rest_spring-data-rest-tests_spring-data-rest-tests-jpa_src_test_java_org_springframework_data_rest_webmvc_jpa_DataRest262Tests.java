<METHOD_START> @ Before public void void ( ) { org.springframework.data.rest.webmvc.jpa.ObjectMapper . setVisibility ( PropertyAccessor . FIELD , Visibility . ANY ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport = org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AirportRepository . save ( new org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport ( ) ) ; java.lang.String java.lang.String = STRING + org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport . java.lang.Long + STRING ; org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AircraftMovement org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AircraftMovement = org.springframework.data.rest.webmvc.jpa.ObjectMapper . readValue ( java.lang.String , org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AircraftMovement .class ) ; assertThat ( org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AircraftMovement . org.springframework.data.rest.webmvc.jpa.DataRest262Tests.FlightPart . org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport . java.lang.Long ) . isEqualTo ( org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport . java.lang.Long ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) java.lang.Exception { org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport = new org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport ( ) ; org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport . java.lang.Long = NUMBER ; org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport = new org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport ( ) ; org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport . java.lang.Long = NUMBER ; org.springframework.data.rest.webmvc.jpa.DataRest262Tests.FlightPart org.springframework.data.rest.webmvc.jpa.DataRest262Tests.FlightPart = new org.springframework.data.rest.webmvc.jpa.DataRest262Tests.FlightPart ( ) ; org.springframework.data.rest.webmvc.jpa.DataRest262Tests.FlightPart . org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport = org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport ; org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AircraftMovement org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AircraftMovement = new org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AircraftMovement ( ) ; org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AircraftMovement . java.lang.Long = NUMBER ; org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AircraftMovement . org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport = org.springframework.data.rest.webmvc.jpa.DataRest262Tests.Airport ; org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AircraftMovement . org.springframework.data.rest.webmvc.jpa.DataRest262Tests.FlightPart = org.springframework.data.rest.webmvc.jpa.DataRest262Tests.FlightPart ; JpaPersistentEntity < ? > org.springframework.data.rest.webmvc.jpa.JpaPersistentEntity<?> = org.springframework.data.rest.webmvc.jpa.JpaMetamodelMappingContext . getRequiredPersistentEntity ( org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AircraftMovement .class ) ; Resource < java.lang.Object > org.springframework.data.rest.webmvc.jpa.Resource<java.lang.Object> = PersistentEntityResource . build ( org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AircraftMovement , org.springframework.data.rest.webmvc.jpa.JpaPersistentEntity<> ) . withLink ( new Link ( STRING + org.springframework.data.rest.webmvc.jpa.DataRest262Tests.AircraftMovement . java.lang.Long ) ) . build ( ) ; java.lang.String java.lang.String = org.springframework.data.rest.webmvc.jpa.ObjectMapper . writeValueAsString ( org.springframework.data.rest.webmvc.jpa.Resource<java.lang.Object> ) ; assertThat ( JsonPath .< java.lang.Object > read ( java.lang.String , STRING ) ) . isNotNull ( ) ; assertThat ( JsonPath .< java.lang.Object > read ( java.lang.String , STRING ) ) . isNotNull ( ) ; assertThat ( JsonPath .< java.lang.Object > read ( java.lang.String , STRING ) ) . isNotNull ( ) ; }  <METHOD_END>
