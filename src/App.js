import React from 'react';

function App() {

  var board = document.getElementById('boardInner');
  var numContainer = document.getElementById('numberContainer');
  var letterContainer = document.getElementById('letterContainer');
  var letters = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H']
  var numbers = ['1', '2', '3', '4', '5', '6', '7', '8']
  var boardDim = letters.length
  var display = 'block'
  
  const renderLabels = () => {
    letters.forEach((x,i)=>{
      var el = document.createElement('DIV')
      var el2 = document.createElement('DIV')
      el.innerText = x
      el.className = 'label'
      el2.innerText = numbers[i]
      el2.className = 'label'
      numContainer.appendChild(el2)
      letterContainer.appendChild(el)
    })
  }
  
  const renderBoard = (useLabels) =>{
    
    if (useLabels){
      renderLabels() 
    }
   
    for (var i = 0; i < boardDim; ++i){
      var row = document.createElement('DIV')
      row.className = 'row'
      row.style.flexDirection = i % 2 === 0 ? '' : 'row-reverse'; 
      for (var j = 0; j < boardDim; ++j){
        var square = document.createElement('DIV')
        square.className = 'square'
        square.style.backgroundColor = j % 2 === 0 ? 'white' : 'black'
        if (i%boardDim < 2 || i%boardDim >= boardDim-2) {
          square.innerHTML = `<img src="https://avatars2.githubusercontent.com/u/37048727?s=64&v=4" width="15px" height="15px" style="padding-left:5px;padding-top:5px"/>`
        }
        row.appendChild(square)
      }
      board.appendChild(row)
    }   
   }
  
  // pass true as the argument in the function below to render the labels.
  renderBoard(true)

  return (
    <div className="App">
      <h1>Hello!</h1>
    </div>
  );
}

export default App;
