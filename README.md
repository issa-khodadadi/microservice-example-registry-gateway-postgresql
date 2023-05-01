# microservice example including (REGISTRY, GATEWAY) plus PostgreSQL

this is a simple project to see the architecture of microservice that has a registry service, two microservices that communicate with each other and a gateway to rout
the client request.

the client send request to gateway-service, 
gateway-service will rout the request to the order-service, 
order-service will call the payment-service 


# you can test it with postman:

first start registry-service

then run order-service and payment-service

at last run gateway-service

and try to send request via postman by following steps:

url: http://localhost:8888/order/bookorder
Method: POST

requestBode as Json:

    {
        "order":{
            "id":110,
            "name":"harryPotter",
            "qty":2,
            "price":12000
        },
        "payment":{}
    }


you can track microservices status by checking http://localhost:8761/ in your browser.
