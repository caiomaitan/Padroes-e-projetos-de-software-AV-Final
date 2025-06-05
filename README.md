# Caio Maitan - 837704
# João Vitor Bernardes - 837901
# Lorenzo Janota - 838633

# Sistema de Pedidos Online - Java

## 🎯 Objetivo

Aplicar **3 padrões de projeto** (Singleton, Factory Method e Observer) em uma aplicação Java que simula um sistema de pedidos online.

---

## 💡 Tema Escolhido

**Sistema de Pedidos Online**, onde um cliente pode adicionar lanches e bebidas a um pedido. O sistema notifica o cliente sobre o status do pedido e salva o pedido em um "banco" simulado.

---

## 🧱 Arquitetura Geral

- Produtos (Lanche, Bebida) são criados com uma **fábrica (Factory Method)**.
- Um pedido notifica o **cliente (Observer)** conforme o status muda.
- A conexão com banco de dados é simulada com uma classe **Singleton**.

---

## 🧩 Padrões Aplicados

### ✅ Singleton
- **Classe:** `DatabaseConnection`
- **Por quê:** Garantir que a conexão com banco seja única e controlada.

### ✅ Factory Method
- **Classe:** `ProdutoFactory`
- **Por quê:** Criar produtos (Lanche/Bebida) dinamicamente, sem acoplamento.

### ✅ Observer
- **Classes:** `Cliente` (observador) e `Pedido` (sujeito)
- **Por quê:** Notificar automaticamente o cliente sobre mudanças de status no pedido.
