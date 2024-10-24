---
marp: true
theme: venson
author: Ramon Venson
title: Extra 06 - Versionamento Semântico
footer: Disciplina de Backend - Professor Ramon Venson - SATC 2024
header: Extra 06 - Versionamento Semântico
---

<!-- 
_class: lead
-->

# Extra 06 - Versionamento Semântico

---

## O que é versionamento semântico?

* Versionamento Semântico (SemVer) é um sistema de numeração de versões que reflete mudanças no código de forma estruturada;
* O objetivo é facilitar o controle de versões e a compatibilidade entre diferentes sistemas e bibliotecas;
* As versões seguem o formato **MAJOR.MINOR.PATCH** (ex.: `1.2.3`);

---

### O que cada número significa?

1. **MAJOR**: Mudanças incompatíveis com versões anteriores;
2. **MINOR**: Adiciona novas funcionalidades de forma compatível com versões anteriores;
3. **PATCH**: Correção de bugs de forma compatível com versões anteriores;

---

## Exemplo de Versionamento Semântico

### 1.0.0

* **1**: Primeira versão lançada. Representa uma grande mudança ou o lançamento inicial;
* **0**: Nenhuma nova funcionalidade foi adicionada desde o lançamento inicial;
* **0**: Nenhuma correção de bugs foi necessária;

---

### Mudanças no código

| Versão    | Descrição |
|-----------|-----------|
| **1.0.1** | Correção de pequenos bugs sem novas funcionalidades |
| **1.1.0** | Nova funcionalidade adicionada, compatível com 1.x.x |
| **2.0.0** | Alterações que quebram compatibilidade com a versão 1.x.x |

---

## Regras do Semantic Versioning

1. **A API pública deve ser definida com precisão**: Você deve deixar claro quais partes do código fazem parte da API pública e serão afetadas pelo versionamento;
2. **Mudança de MAJOR**: Sempre que houver uma mudança que quebre a compatibilidade com a versão anterior;
3. **Mudança de MINOR**: Adição de funcionalidades sem quebrar a compatibilidade existente;
4. **Mudança de PATCH**: Correções de bugs ou pequenos ajustes que não impactam a API pública;

---

### Exemplo com JSON

```json
{
  "version": "2.1.3"
}
```

Neste exemplo:
* **2**: Mudança na API que não é compatível com a versão anterior.
* **1**: Funcionalidades novas foram adicionadas de forma compatível.
* **3**: Correções de bugs foram aplicadas.

---

## Regras adicionais

* Se a versão inicial é `0.x.x`, isso indica que a API ainda não está estável.
* Versionamento Semântico facilita a integração de sistemas e a gestão de dependências.

---

## O que aprendemos hoje

* O que é o Semantic Versioning;
* A diferença entre **MAJOR**, **MINOR**, e **PATCH**;
* Como as versões refletem mudanças no código.
