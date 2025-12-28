# Exercício 03 - Sistema de Streaming de Música

## Objetivo
Implementar um sistema de streaming de música utilizando padrões de design.

---

## Part A: Criação de Playlists
Implemente um mecanismo para criar diferentes tipos de playlists:
- **RockPlaylist** - Para música rock
- **PopPlaylist** - Para música pop
- **JazzPlaylist** - Para música jazz

Cada playlist deve ter:
- `name` (String)
- `genre` (String)

Use `PlaylistFactory.createPlaylist(type, name)` para criar playlists.

---

## Part B: Personalização de Músicas
Implemente um mecanismo para adicionar funcionalidades extras às músicas:
- **BasicSong** - Música básica
- **EqualizerDecorator** - Adiciona equalização
- **LyricsDecorator** - Adiciona letras

Cada música tem o método `play()` que deve mostrar todas as features ativas.

---

## Part C: Processamento de Pedidos
Implemente um sistema de processamento de pedidos de músicas que:
- Tenta processar por **género**
- Se não conseguir, tenta processar por **artista**
- Se não conseguir, usa um processador **padrão**

Cada handler pode processar o pedido ou passar para o próximo na cadeia.

---

## Part D: Controlo do Player
Implemente um controlo remoto para o player que suporta comandos:
- **Play** - Iniciar reprodução
- **Pause** - Pausar reprodução
- **Skip** - Saltar música

Use `RemoteControl` para executar os comandos no `Player`.

---

## Part E: Sistema de Notificações
Implemente um sistema de notificações com:
- **DisplayModule** - Atualiza o display
- **AnalyticsModule** - Regista estatísticas

Use `StreamingCenter` para gerir as notificações.

---

## Part F: Registo de Operações
Registe todas as playlists criadas num ficheiro `streaming.txt` na pasta `Learning03`.

---

## Output Esperado:
```
Part A: Creating playlists
RockPlaylist created: My Rock Collection
PopPlaylist created: Top Pop Hits
JazzPlaylist created: Smooth Jazz

Part B: Decorating songs
Playing: Song1
Playing: Song1 with Equalizer
Playing: Song1 with Equalizer and Lyrics

Part C: Processing song requests
Processing request by genre: rock
Processing request by artist: Beatles
Default processing for: podcast

Part D: Player commands
Player: Playing
Player: Paused
Player: Skipping to next track

Part E: Notifications
[DISPLAY] Track started: Song1
[ANALYTICS] Track started: Song1

Part F: Registry content
Content of file "streaming.txt":
Playlist [type=rock, name=My Rock Collection]
Playlist [type=pop, name=Top Pop Hits]
Playlist [type=jazz, name=Smooth Jazz]
```

---

## Estrutura Esperada:
O sistema deve ter classes para:
- Criar diferentes tipos de playlists
- Adicionar funcionalidades a músicas
- Processar pedidos em cadeia
- Executar comandos no player
- Notificar módulos de eventos
- Registar operações num singleton
