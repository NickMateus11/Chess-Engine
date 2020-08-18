import React from 'react';
import * as PIECES from './imgs';

function App() {
  var board = document.getElementById('boardInner');
  var numContainer = document.getElementById('numberContainer');
  var letterContainer = document.getElementById('letterContainer');
  var letters = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'];
  var numbers = ['1', '2', '3', '4', '5', '6', '7', '8'];
  var boardDim = letters.length;
  var display = 'block';
  var colorPack = ['blanchedAlmond', 'brown'];

  const renderLabels = () => {
    letters.forEach((x, i) => {
      var el = document.createElement('DIV');
      var el2 = document.createElement('DIV');
      el.innerText = x;
      el.className = 'label';
      el2.innerText = numbers[i];
      el2.className = 'label';
      numContainer.appendChild(el2);
      letterContainer.appendChild(el);
    });
  };

  const orderedPieces = [
    PIECES['blackRook'],
    PIECES['blackKnight'],
    PIECES['blackBishop'],
    PIECES['blackKing'],
    PIECES['blackQueen'],
    PIECES['blackBishop'],
    PIECES['blackKnight'],
    PIECES['blackRook'],
    PIECES['blackPawn'],
    PIECES['blackPawn'],
    PIECES['blackPawn'],
    PIECES['blackPawn'],
    PIECES['blackPawn'],
    PIECES['blackPawn'],
    PIECES['blackPawn'],
    PIECES['blackPawn'],
    PIECES['whitePawn'],
    PIECES['whitePawn'],
    PIECES['whitePawn'],
    PIECES['whitePawn'],
    PIECES['whitePawn'],
    PIECES['whitePawn'],
    PIECES['whitePawn'],
    PIECES['whitePawn'],
    PIECES['whiteRook'],
    PIECES['whiteKnight'],
    PIECES['whiteBishop'],
    PIECES['whiteKing'],
    PIECES['whiteQueen'],
    PIECES['whiteBishop'],
    PIECES['whiteKnight'],
    PIECES['whiteRook'],
  ];

  const renderBoard = (useLabels) => {
    if (useLabels) {
      renderLabels();
    }

    let k = 0;
    for (let i = 0; i < boardDim; i++) {
      const row = document.createElement('DIV');
      row.className = 'row';
      row.style.flexDirection = i % 2 === 0 ? '' : 'row-reverse';
      for (let j = 0; j < boardDim; j++) {
        const square = document.createElement('DIV');
        square.className = 'square';
        square.style.backgroundColor = colorPack[j % 2];
        if (i % boardDim < 2 || i % boardDim >= boardDim - 2) {
          square.innerHTML = `<img class="piece_img" src=${orderedPieces[k]} />`;
          k++;
        }
        row.appendChild(square);
      }
      board.appendChild(row);
    }
  };

  // pass true as the argument in the function below to render the labels.
  renderBoard(true);

  return (
    <div className="App">
      <h1>Hello!</h1>
    </div>
  );
}

export default App;
