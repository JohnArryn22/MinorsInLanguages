//type rfc to get the snippet for react function based component

import { useState } from "react";
import React from "react";

export default function Textform(props) {
  const handleOnChange = (event) => {
    // console.log("On Change")
    setText(event.target.value);

  };
  const handleUpClick = () => {
    // console.log("Upper Case Button was clicked");
    let newText = text.toUpperCase();
    setText(newText);
    props.showAlert("Converted to UpperCase", "success");
  };
  const handleDownClick = () => {
    // console.log("Lowercase button was clicked")
    let newText = text.toLowerCase();
    setText(newText);
    props.showAlert("Converted to LowerCase", "success");
  };
  const handleCopy = () => {
    
    // var text = document.getElementById("myBox")
    // text.select()
    // text.setSelectionRange(0, 9999)
    navigator.clipboard.writeText(text)
    // document.getSelection().removeAllRanges()
    
    props.showAlert("Copied to clipBoard", "success");

  }
  const handleToggle = () => {
    // console.log("ToggleCase button was clicked")
    function toggleCase(str) {
      let updated = "";
      const [upp_start, upp_end, low_start, low_end] = "AZaz"
        .split("")
        .map((x) => x.charCodeAt(0));

      for (let i = 0; i < str.length; i++) {
        const charCode = str[i].charCodeAt(0);
        let diff = 0;
        if (charCode >= upp_start && charCode <= upp_end) {
          // change uppercase to lowercase
          diff = low_end - upp_end;
        } else if (charCode >= low_start && charCode <= low_end) {
          // change lowercase to uppercase
          diff = upp_end - low_end;
        }
        updated = updated + String.fromCharCode(charCode + diff);
      }
      return updated;
    }
    let newText = toggleCase(text);
    setText(newText);
    props.showAlert("Case was toggled", "success");
  };
  const handleExtraSpaces = () => {
    let newText = text.split(/[ ]+/)
    setText(newText.join(" "))
    props.showAlert("Extra Spaces Have Been Removed", "success")
  }
  const handleErase = () => {
    setText("")
    props.showAlert("Text Cleared", "success")

  }
  
  const [text, setText] = useState("Enter text");
  // text="Enter your text here" //this is the wrong way to change the state
  // setText("It is the text to be formatted") // this is the new way to change the state

  return (
    <>
      {/* Below is the main div which contains heading and textarea */}
      <div className="container" style={{ color: props.mode === 'dark' ? 'white' : 'black' }} >
        <h1 className="my-3" style={{
          backgroundColor: props.mode === 'dark' ? '#24242b' : 'white',
          color: props.mode === 'dark' ? 'white' : 'black'
        }}>{props.heading}</h1>
        <div className="mb-3">
          <textarea className="form-control" value={text} onChange={handleOnChange} style={{
            backgroundColor: props.mode === 'dark' ? '#24242b' : 'white',
            color: props.mode === 'dark' ? 'white' : 'black'
          }} id="myBox" rows="8"
          ></textarea>
        </div>
        <button disabled={text.length===0} className="btn btn-primary my-2" onClick={handleUpClick}>
          Convert to uppercase
        </button>
        <button disabled={text.length===0} className="btn btn-primary mx-2 my-2" onClick={handleDownClick}>
          Convert to lowercase
        </button>
        <button disabled={text.length===0} className="btn btn-primary mx-2 my-2" onClick={handleToggle}>
          ToggleCase
        </button>
        <button disabled={text.length===0} className="btn btn-primary mx-2 my-2" onClick={handleCopy}>
          Copy to clipboard
        </button>
        <button disabled={text.length===0} className="btn btn-primary mx-2 my-2" onClick={handleExtraSpaces}>
          Remove Extra Spaces
        </button>
        <button disabled={text.length===0} className="btn btn-primary mx-2 my-2" onClick={handleErase}>
          Clear Text
        </button>
      </div>

      {/* Below container is for previewing text */}
      <div className="container my-3" style={{ color: props.mode === 'dark' ? 'white' : 'black' }}>
        <h1>Your text summary </h1>
        <p>
          {text.split(/\s+/).filter((element)=>{return element.length!==0}).length} words and {text.length} characters
        </p>
        <p>
          You will read all the text in {0.008 * text.split(" ").filter((element)=>{return element.length!==0}).length} minutes{" "}
        </p>
        <h2>Preview</h2>
        <p>{text.length > 0 ? text : "Enter something in the textbox to preview it here"}</p>
      </div>
    </>
  );
}
// (text.charAt(text.length==" ")?text.split(" ").length-1:text.split(" ").length)