# PulsaPay: Indonesian Mobile Credit Purchase System

PulsaPay is a professional mobile credit purchasing solution designed to simplify pulsa transactions for Indonesian users. The system automatically detects mobile operators, calculates taxes, and provides transparent pricing for all transactions.

## Features

- 📱 **Automatic Operator Detection**: Instantly identifies Indonesian mobile operators based on number prefixes (Telkomsel, Indosat, Three, Smartfren)
- 💸 **Transparent Pricing**: Clear breakdown of costs including 5% tax
- 🎁 **Smart Bonus System**: Automatic 10% bonus for purchases over Rp 25,000
- 💰 **Payment Validation**: Real-time balance checking and change calculation
- 🇮🇩 **Indonesia-Focused**: Specialized for Indonesian mobile networks and pricing structures

## Technology Stack

- Java SE
- NetBeans IDE
- Console-based interface

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- NetBeans IDE (recommended) or any Java IDE

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/pulsapay.git
   ```

2. Open in NetBeans:
   - File > Open Project
   - Select the cloned repository folder

3. Build and run:
   - Right-click project > Run

### Usage Example

```java
// Sample transaction flow
Scanner input = new Scanner(System.in);
System.out.print("Masukan Kode Nomor Hp Anda : "); 
String kode = input.next(); // Enter phone number prefix

// System automatically detects operator
// Then proceed with purchase amount
System.out.print("Masukan Nominal Pengisian Pulsa : Rp ");
int nominal = input.nextInt(); 
```

## Project Structure

```
PulsaPay/
├── src/
│   └── uas/
│       └── alpro/
│           └── pkg1/
│               └── UAS_ALPRO_1.java
├── build/
├── test/
├── lib/
└── nbproject/
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/new-operator-support`)
3. Commit your changes (`git commit -m 'Add new operator detection'`)
4. Push to the branch (`git push origin feature/new-operator-support`)
5. Create a new Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

---

*PulsaPay - Making mobile credit transactions simple and transparent for Indonesian users*
