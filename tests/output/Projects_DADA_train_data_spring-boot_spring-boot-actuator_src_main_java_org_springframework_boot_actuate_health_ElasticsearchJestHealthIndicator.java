<METHOD_START> public void ( JestClient org.springframework.boot.actuate.health.JestClient ) { this . org.springframework.boot.actuate.health.JestClient = org.springframework.boot.actuate.health.JestClient ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( Health . Health Health.Builder ) throws java.lang.Exception { JestResult org.springframework.boot.actuate.health.JestResult = this . org.springframework.boot.actuate.health.JestClient . execute ( new Stats . Stats ( ) . build ( ) ) ; JsonElement org.springframework.boot.actuate.health.JsonElement = this . org.springframework.boot.actuate.health.JsonParser . parse ( org.springframework.boot.actuate.health.JestResult . getJsonString ( ) ) ; JsonObject org.springframework.boot.actuate.health.JsonObject = org.springframework.boot.actuate.health.JsonElement . getAsJsonObject ( ) . get ( STRING ) . getAsJsonObject ( ) ; int int = org.springframework.boot.actuate.health.JsonObject . get ( STRING ) . getAsInt ( ) ; if ( int != NUMBER ) { Health.Builder . outOfService ( ) ; } else { Health.Builder . up ( ) ; } }  <METHOD_END>
