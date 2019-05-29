# QA garage
Simple dummy garage status server

## Run the server

### Unix
```bash
./gradlew clean bootRun
```

### Windows
```bash
gradlew.bat clean bootRun
```

## Usage

### Requests

#### Status endpoint

```text
URL: http://localhost:8085/status
Method: GET
Headers:
Content-Type: application/json
Accept: application/json

Request body:
{
}

Response body:
{
    "available": true
}

```
