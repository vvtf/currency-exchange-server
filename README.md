# currency-exchange-server
Simple dummy currency exchange server for school project

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

The server supports 3 currencies: CZK, EUR, USD

### Requests

#### Exchange endpoint

```text
URL: http://localhost:8085/exchange
Method: GET
Headers:
Content-Type: application/json
Accept: application/json

Request body:
{
	"originalCurrency": "CZK",
	"targetCurrency": "EUR",
	"sum": 47.65
}

Response body:
{
    "originalCurrency": "CZK",
    "targetCurrency": "EUR",
    "exchangeRate": 0.03974563,
    "originalAmount": 47.65,
    "exchangedAmount": 1.8938793
}

```

#### Supported currencies

```text
URL: http://localhost:8085/currencies
Method: GET
Headers:
Accept: application/json

Request body: empty

Response body:
[
    "CZK",
    "EUR",
    "USD"
]
```
