<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return java.lang.Class<? extends org.springframework.data.jpa.convert.threeten.Jsr310JpaConvertersIntegrationTests.Config> ( ) . java.lang.Package ( ) . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assumeTrue ( currentEntityManagerIsAJpa21EntityManager ( org.springframework.data.jpa.convert.threeten.EntityManager ) ) ; DateTimeSample org.springframework.data.jpa.convert.threeten.DateTimeSample = new DateTimeSample ( ) ; sample . instant = java.time.Instant . java.time.Instant ( ) ; sample . localDate = java.time.LocalDate . java.time.LocalDate ( ) ; sample . localTime = java.time.LocalTime . java.time.LocalTime ( ) ; sample . localDateTime = java.time.LocalDateTime . java.time.LocalDateTime ( ) ; sample . zoneId = java.time.ZoneId . java.time.ZoneId ( STRING ) ; org.springframework.data.jpa.convert.threeten.EntityManager . persist ( org.springframework.data.jpa.convert.threeten.DateTimeSample ) ; org.springframework.data.jpa.convert.threeten.EntityManager . flush ( ) ; org.springframework.data.jpa.convert.threeten.EntityManager . clear ( ) ; DateTimeSample org.springframework.data.jpa.convert.threeten.DateTimeSample = org.springframework.data.jpa.convert.threeten.EntityManager . find ( DateTimeSample .class , sample . id ) ; assertThat ( org.springframework.data.jpa.convert.threeten.DateTimeSample , is ( notNullValue ( ) ) ) ; assertThat ( result . instant , is ( sample . instant ) ) ; assertThat ( result . localDate , is ( sample . localDate ) ) ; assertThat ( result . localTime , is ( sample . localTime ) ) ; assertThat ( result . localDateTime , is ( sample . localDateTime ) ) ; assertThat ( result . zoneId , is ( sample . zoneId ) ) ; }  <METHOD_END>
