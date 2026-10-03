# Change Log

All notable changes to the "arch-simple" extension will be documented in this file.

Check [Keep a Changelog](http://keepachangelog.com/) for recommendations on how to structure this file.

## [1.0.15] - 2026-09-24

### Alterado
- Metadados do repositório atualizados para o novo endereço do projeto: `repository.url` no `package.json` e o preview do tema no `README.md`.

## [1.0.14] - 2026-09-24

### Corrigido
- **Seleção de texto visível**: as cores de seleção e de destaque de palavra estavam praticamente invisíveis sobre o fundo `#1e1e2e` (contraste efetivo de ~1,06:1 a ~1,26:1). Foram reajustadas para tons mais claros da mesma paleta neutra, sem introduzir cores novas nem o azul padrão do VS Code:
  - `editor.selectionBackground` — 1,26:1 → **2,14:1**
  - `editor.selectionHighlightBackground` / `editor.wordHighlightBackground` — 1,06:1 → **1,50:1 / 1,73:1**
  - `editor.findMatchBackground` — 1,77:1 → **2,67:1**
- Bordas de contraste (`selectionHighlightBorder`, `wordHighlightBorder`, `wordHighlightStrongBorder`, `findMatchBorder`) para delimitar o destaque com clareza.
- `editor.inactiveSelectionBackground` definido explicitamente.

### Mantido
- Filosofia minimalista: nenhuma cor nova na paleta — só variações mais claras dos neutros já usados.

## [1.0.13] - 2026-08-18

### Adicionado
- **UI neutra**: ~95 cores novas de interface em tons neutros da própria paleta (`#2a2a3c`, `#3b3b52`, `#45455f`) — elimina o azul padrão do VS Code em:
  - Seleção de texto, busca e highlight de palavras
  - Autocomplete (suggest widget), tooltips (hover), peek view
  - Inputs, dropdowns, checkboxes e botões
  - Listas (explorer), menus de contexto, badges e notificações
  - Scrollbar, foco e abas (foreground ativa/inativa)
- **Git discreto**: gutter e explorer com as cores suaves do tema (verde/amarelo/rosa/azul já existentes), sem tons berrantes.
- **Terminal com 16 cores ANSI** discretas derivadas da paleta (antes usava o padrão).
- **Diff editor** com sobreposições suaves das cores do tema.

### Mantido
- Filosofia minimalista: nenhuma cor nova na paleta — só neutros + as 5 cores de destaque que já existiam.

## [1.0.12] - 2026-08-16

- Ícone ajustado para 1024×1024.
- Preview corrigido via repositório GitHub (README aponta para screenshot).

## [1.0.11] - 2026-08-15

- Publicação inicial nos dois registries (Open VSX e VS Code Marketplace).
