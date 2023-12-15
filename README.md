# BAIGIAMASIS DARBAS

Web page for testing https://simka.lt/

### TS1 User Login

#### TC1.1 (Positive) Existing user login using valid data:

* Click on 'Paskyra' button at main page
* Enter valid email
* Enter valid password
* Click login button
* Check if title contains 'Mano paskyra'

#### TC1.2 (Negative) Try to login using Invalid email and Valid password

* Click on 'Paskyra' button at main page
* Enter invalid email
* Enter valid password
* Click login button
* Check whether a message has appeared: Įspėjimas: El. paštas ir/arba slaptažodis nerasti sistemoje.

#### TC1.3 (Negative) Try to login using Valid email and Invalid password

* Click on 'Paskyra' button at main page
* Enter valid email
* Enter invalid password
* Click login button
* Check whether a message has appeared: Įspėjimas: El. paštas ir/arba slaptažodis nerasti sistemoje.

### TS2 Product search

#### TS2.1 (Positive) Product search using valid data

* Enter valid value into search input field
* Click on search button
* Check if page with results contains 'Filtras'

#### TS2.2 (Negative) Product search using invalid data

* Enter invalid value into search input field
* Click search button
* Check whether a message has appeared: Nėra prekės, kuri atitiktų paieškos kriterijus.

### TS3 Product adding to the cart

#### TC3.1 Adding one product to the cart

* Click on products category at main page
* Click on subcategory of previous selected category at main page
* Click on first suggested product
* In product card select first available size of product
* Check whether a message has appeared: Pavyko: Jūs patalpinote