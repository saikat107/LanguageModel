<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return java.lang.Class<? extends org.springframework.data.jpa.convert.threetenbp.ThreeTenBackPortJpaConvertersIntegrationTests.Config> ( ) . java.lang.Package ( ) . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assumeTrue ( currentEntityManagerIsAJpa21EntityManager ( org.springframework.data.jpa.convert.threetenbp.EntityManager ) ) ; DateTimeSample org.springframework.data.jpa.convert.threetenbp.DateTimeSample = new DateTimeSample ( ) ; sample . instant = Instant . now ( ) ; sample . localDate = LocalDate . now ( ) ; sample . localTime = LocalTime . now ( ) ; sample . localDateTime = LocalDateTime . now ( ) ; sample . zoneId = ZoneId . of ( STRING ) ; org.springframework.data.jpa.convert.threetenbp.EntityManager . persist ( org.springframework.data.jpa.convert.threetenbp.DateTimeSample ) ; org.springframework.data.jpa.convert.threetenbp.EntityManager . flush ( ) ; org.springframework.data.jpa.convert.threetenbp.EntityManager . clear ( ) ; DateTimeSample org.springframework.data.jpa.convert.threetenbp.DateTimeSample = org.springframework.data.jpa.convert.threetenbp.EntityManager . find ( DateTimeSample .class , sample . id ) ; assertThat ( org.springframework.data.jpa.convert.threetenbp.DateTimeSample , is ( notNullValue ( ) ) ) ; assertThat ( result . instant , is ( sample . instant ) ) ; assertThat ( result . localDate , is ( sample . localDate ) ) ; assertThat ( result . localTime , is ( sample . localTime ) ) ; assertThat ( result . localDateTime , is ( sample . localDateTime ) ) ; assertThat ( result . zoneId , is ( sample . zoneId ) ) ; }  <METHOD_END>
