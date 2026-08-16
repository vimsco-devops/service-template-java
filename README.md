# service-template-java

The golden path reference service — Java / Spring Boot track. Same role as
`service-template`, generated when a "New Microservice Request (Java)" issue
is filed against the platform.

## Local development
```bash
mvn spring-boot:run    # serves on :8080
mvn test
```

## Endpoints
- `GET /actuator/health/liveness` — liveness
- `GET /actuator/health/readiness` — readiness
- `GET /api/hello` — replace with your service's real routes

## CI/CD
`.github/workflows/ci.yml` is a thin caller into `platform-org`'s
`reusable-ci-java.yml` — see that repo for what actually runs.

