# Development

<img alt="developer" src=".github/developer.png">

## Commits
message:
```
FEATURE: what done
```

## Branches
- Each feature has a separate branch
- Each branch is merged into master only after PR
- PR must be reviewed

## Documentation
- Swagger via annotations - http://localhost:8080/swagger-ui

## Packages hierarchy
- config - contains application configs 
- controller - api controllers
  - advice - @ControllerAdvice as exception handler 
- dto 
  - request - api requests with swagger annotations
  - response - api responses with swagger annotations
- entity - db entity
- exception - custom exceptions
- repository - specify db request methods
- service - main logic 