import Textform from "./Component/Textform";
import Navbar from "./Component/Navbar";
import Alert from "./Component/Alert";
import About from "./Component/About";
import React from "react";
import { useState } from "react";
import {
  BrowserRouter,
  Route,
  Routes,
} from "react-router-dom";

function App() {
  const removeBackgroundClasses = () => {
    document.body.classList.remove('bg-light')
    document.body.classList.remove('bg-success')
    document.body.classList.remove('bg-danger')
    document.body.classList.remove('bg-primary')
    document.body.classList.remove('bg-warning')
    document.body.classList.remove('bg-dark')
  }
  const toggleMode = (cls) => {
    removeBackgroundClasses()
    console.log(cls)
    document.body.classList.add('bg-'+ cls)
    if (mode === "light") {
      setMode("dark");
      document.body.style.backgroundColor = "#343a40";
      showAlert( `${cls} Mode Has Been Enabled`, "success");
      // document.title = "TextUtils-Dark Mode";
    } else {
      setMode("light");
      document.body.style.backgroundColor = "white";
      showAlert(`${cls} Mode Has Been Enabled`, "success");
      // document.title = "TextUtils-Light Mode";
    }
  };
  const [mode, setMode] = useState("light");
  const [alert, setalert] = useState(null);
  const showAlert = (message, type) => {
    setalert({
      msg: message,
      type: type,
    });
    setTimeout(() => {
      setalert(null);
    }, 2000);
  };
  return (
    <>
      <BrowserRouter>
        <Navbar title="Text Utils" aboutText="About-us" mode={mode} toggleMode={toggleMode} />
        <Alert alert={alert} />
        <Routes>
          <Route path="/*" element={<Textform heading="Enter the text to analyze" showAlert={showAlert} mode={mode} />} />
          {/* <Textform heading="Enter the text to analyze" showAlert={showAlert} mode={mode} /> */}
          <Route path="/about/*" element={<About mode={mode} />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
