<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( this . org.springframework.core.codec.ResourceEncoder . canEncode ( ResolvableType . forClass ( InputStreamResource .class ) , MimeTypeUtils . TEXT_PLAIN ) ) ; assertTrue ( this . org.springframework.core.codec.ResourceEncoder . canEncode ( ResolvableType . forClass ( ByteArrayResource .class ) , MimeTypeUtils . TEXT_PLAIN ) ) ; assertTrue ( this . org.springframework.core.codec.ResourceEncoder . canEncode ( ResolvableType . forClass ( Resource .class ) , MimeTypeUtils . TEXT_PLAIN ) ) ; assertTrue ( this . org.springframework.core.codec.ResourceEncoder . canEncode ( ResolvableType . forClass ( InputStreamResource .class ) , MimeTypeUtils . APPLICATION_JSON ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; Resource org.springframework.core.codec.Resource = new ByteArrayResource ( java.lang.String . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ) ; Mono < Resource > org.springframework.core.codec.Mono<org.springframework.core.codec.Resource> = Mono . just ( org.springframework.core.codec.Resource ) ; Flux < DataBuffer > org.springframework.core.codec.Flux<org.springframework.core.codec.DataBuffer> = this . org.springframework.core.codec.ResourceEncoder . encode ( org.springframework.core.codec.Mono<org.springframework.core.codec.Resource> , this . bufferFactory , ResolvableType . forClass ( Resource .class ) , null , java.util.Collections . java.util.Map<java.lang.Object,java.lang.Object> ( ) ) ; StepVerifier . create ( org.springframework.core.codec.Flux<org.springframework.core.codec.DataBuffer> ) . consumeNextWith ( stringConsumer ( java.lang.String ) ) . expectComplete ( ) . verify ( ) ; }  <METHOD_END>
