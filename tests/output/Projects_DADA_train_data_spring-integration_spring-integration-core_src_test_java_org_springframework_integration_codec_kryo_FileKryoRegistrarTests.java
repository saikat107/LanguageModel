<METHOD_START> @ Test public void void ( ) java.io.IOException { PojoCodec org.springframework.integration.codec.kryo.PojoCodec = new PojoCodec ( new FileKryoRegistrar ( ) ) ; java.io.File java.io.File = new java.io.File ( STRING ) ; java.io.File java.io.File = org.springframework.integration.codec.kryo.PojoCodec . decode ( org.springframework.integration.codec.kryo.PojoCodec . encode ( java.io.File ) , java.io.File .class ) ; assertEquals ( java.io.File , java.io.File ) ; }  <METHOD_END>
