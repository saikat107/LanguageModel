<METHOD_START> public void ( CustomerRepository sample.hateoas.web.CustomerRepository , EntityLinks sample.hateoas.web.EntityLinks ) { this . sample.hateoas.web.CustomerRepository = sample.hateoas.web.CustomerRepository ; this . sample.hateoas.web.EntityLinks = sample.hateoas.web.EntityLinks ; }  <METHOD_END>
<METHOD_START> @ GetMapping ( produces = MediaType . APPLICATION_JSON_VALUE ) sample.hateoas.web.HttpEntity<sample.hateoas.web.Resources<sample.hateoas.web.Customer>> < Resources < Customer > > sample.hateoas.web.HttpEntity<sample.hateoas.web.Resources<sample.hateoas.web.Customer>> ( ) { Resources < Customer > sample.hateoas.web.Resources<sample.hateoas.web.Customer> = new Resources <> ( this . sample.hateoas.web.CustomerRepository . findAll ( ) ) ; sample.hateoas.web.Resources<sample.hateoas.web.Customer> . add ( this . sample.hateoas.web.EntityLinks . linkToCollectionResource ( Customer .class ) ) ; return new ResponseEntity <> ( sample.hateoas.web.Resources<sample.hateoas.web.Customer> , HttpStatus . OK ) ; }  <METHOD_END>
<METHOD_START> @ GetMapping ( path = STRING , produces = MediaType . APPLICATION_JSON_VALUE ) sample.hateoas.web.HttpEntity<sample.hateoas.web.Resource<sample.hateoas.web.Customer>> < Resource < Customer > > sample.hateoas.web.HttpEntity<sample.hateoas.web.Resource<sample.hateoas.web.Customer>> ( @ PathVariable java.lang.Long java.lang.Long ) { Resource < Customer > sample.hateoas.web.Resource<sample.hateoas.web.Customer> = new Resource <> ( this . sample.hateoas.web.CustomerRepository . findOne ( java.lang.Long ) ) ; sample.hateoas.web.Resource<sample.hateoas.web.Customer> . add ( this . sample.hateoas.web.EntityLinks . linkToSingleResource ( Customer .class , java.lang.Long ) ) ; return new ResponseEntity <> ( sample.hateoas.web.Resource<sample.hateoas.web.Customer> , HttpStatus . OK ) ; }  <METHOD_END>